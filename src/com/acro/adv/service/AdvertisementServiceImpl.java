package com.acro.adv.service;

import com.acro.adv.model.Advertisement;
import com.acro.adv.model.Content;
import com.acro.adv.repository.AdvRepository;
import com.acro.adv.repository.AdvRepositoryImpl;
import com.acro.adv.repository.ContentRepository;
import com.acro.adv.repository.ContentRepositoryImpl;
import com.acro.adv.request.AdvertisementRequest;
import com.acro.adv.response.AdvertisementResponse;
import com.acro.adv.response.ContentResponse;

import java.util.ArrayList;
import java.util.List;

public class AdvertisementServiceImpl implements AdvertisementService {
    AdvRepository advRepository=new AdvRepositoryImpl();
    ContentRepository contentRepository=new ContentRepositoryImpl();

    public AdvertisementResponse createAdvertisement(AdvertisementRequest advertisementRequest){
        if(advertisementRequest!=null){
            // Check if adv already exists
            Advertisement advertisementByName = getAdvertisementByName(advertisementRequest.getAdvName(), advertisementRequest.getCompanyId());
            if (advertisementByName!=null) {
                throw new RuntimeException("Advertisement already Exists");
            }
            Advertisement advertisement=new Advertisement();
            advertisement.setAdvName(advertisementRequest.getAdvName());
            advertisement.setCompanyId(advertisementRequest.getCompanyId());
            advertisement.setPublishedDate(advertisementRequest.getPublishedDate());
            Advertisement advertisement1 = advRepository.createAdvertisement(advertisement);
            AdvertisementResponse advertisementResponse = createAdvertisementResponse(advertisement1);

            // Now create content first
//           List<ContentRequest> contentRequests = contentRepository.createContent(advertisementRequest.getContentRequests());
            //check if contents saved

            //todo: list of content
            if(advertisementRequest.getContentRequests()!=null && advertisementRequest.getContentRequests().size()>0){
                advertisementRequest.getContentRequests().forEach(contentRequest -> {
                    Content content=new Content();
                    content.setContentName(contentRequest.getContentName());
                    content.setContentDuration(contentRequest.getContentDuration());
                    content.setContentFile(contentRequest.getContentFile());
                    content.setContentType(contentRequest.getContentType());
                    content.setCreatedDate(contentRequest.getCreatedDate());
                    content.setCompanyId(advertisementRequest.getCompanyId());
                    content.setStaffId(contentRequest.getStaffId());
                    content.setAdvId(advertisement1.getAdvId());
                    Content content1 = contentRepository.createContent(content);

                    populateContentResponse(advertisementResponse, content1);
                });

                return advertisementResponse;
            }
            else {
                throw new RuntimeException(" failed Request");
            }
            //createAdvertisement

        }
        else {
            throw new RuntimeException(" Invalid Request");
        }

    }

    private void populateContentResponse(AdvertisementResponse advertisementResponse, Content content) {
        ContentResponse contentResponse =new ContentResponse();
        contentResponse.setContentId(content.getContentId());
        contentResponse.setContentName(content.getContentName());
        contentResponse.setContentDuration(content.getContentDuration());
        contentResponse.setContentFile(content.getContentFile());
        contentResponse.setContentType(content.getContentType());
        contentResponse.setCreatedDate(content.getCreatedDate());
        contentResponse.setCompanyId(content.getCompanyId());
        contentResponse.setStaffId(content.getStaffId());
        contentResponse.setAdvId(content.getAdvId());
        // add in adv response
        advertisementResponse.getContentResponses().add(contentResponse);
    }

    private AdvertisementResponse createAdvertisementResponse(Advertisement advertisement) {
        AdvertisementResponse advertisementResponse = new AdvertisementResponse();
        advertisementResponse.setAdvId(advertisement.getAdvId());
        advertisementResponse.setAdvName(advertisement.getAdvName());
        advertisementResponse.setCompanyId(advertisement.getCompanyId());
        advertisementResponse.setPublishedDate(advertisement.getPublishedDate());
        advertisementResponse.setContentResponses(new ArrayList<>());  //initialize ArrayList
        return advertisementResponse;
    }

    public Advertisement getAdvertisementByName(String advName, long companyId) {
        if (advName != null && companyId >0) {
            Advertisement advertisement = advRepository.getAdvertisementByName(advName,companyId);
            if (advertisement != null) {
                System.out.println("retrieved successfully" + advertisement.getAdvName());
                return advertisement;

            }
        }
        return null;
    }
    public AdvertisementResponse getAdvertisementById(AdvertisementRequest advertisementRequest) {
        if (advertisementRequest.getAdvId() != null && advertisementRequest.getAdvId()>0 && advertisementRequest.getCompanyId()!=null && advertisementRequest.getCompanyId() >0) {
            Advertisement advertisement = advRepository.getAdvertisementById(advertisementRequest.getAdvId(), advertisementRequest.getCompanyId());
            if(advertisement!=null) {
                System.out.println(" retrieved successfully "+ advertisement.getAdvId());
                AdvertisementResponse advertisementResponse = createAdvertisementResponse(advertisement);
                List<Content> contentByAdvertisementId = advRepository.getContentByAdvertisementId(advertisementResponse.getAdvId(), advertisementResponse.getCompanyId());
                contentByAdvertisementId.forEach(c -> populateContentResponse(advertisementResponse,c));
                return advertisementResponse;
            }
        }
        return null;
    }

}


