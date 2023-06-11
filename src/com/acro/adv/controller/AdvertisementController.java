package com.acro.adv.controller;

import com.acro.adv.request.AdvertisementRequest;
import com.acro.adv.response.AdvertisementResponse;
import com.acro.adv.service.AdvertisementService;
import com.acro.adv.service.AdvertisementServiceImpl;

import java.util.List;

public class AdvertisementController {
    AdvertisementService advertisementService=new AdvertisementServiceImpl();
    public AdvertisementResponse saveAdvertisement(AdvertisementRequest advertisementRequest)throws Exception {
        if (advertisementRequest != null
                && advertisementRequest.getAdvName() != null
                && advertisementRequest.getContentRequests() != null && advertisementRequest.getContentRequests().size() > 0) {
            AdvertisementResponse response = advertisementService.createAdvertisement(advertisementRequest);
            return response;

        } else {
            throw new RuntimeException("required fields are not passed");

        }
    }
        public AdvertisementResponse getAdvertisementDetails(AdvertisementRequest advertisementRequest) throws Exception{
            if(advertisementRequest!=null
                    && advertisementRequest.getAdvId()!=null &&advertisementRequest.getAdvId()>0
                && advertisementRequest.getCompanyId()!=null && advertisementRequest.getCompanyId()>0){
                AdvertisementResponse response1= advertisementService.getAdvertisementDetails(advertisementRequest);
                return response1;
            }else {
                throw new RuntimeException(" required fields are not passed");
            }

        }
    public AdvertisementResponse getAdvertisementById(Long advId) throws Exception{
        if(advId!=null && advId>0){
            AdvertisementResponse response1= advertisementService.getAdvertisementById(advId);
            return response1;
        }else {
            throw new RuntimeException(" required fields are not passed");
        }

    }
    public List<AdvertisementResponse> getAllAdvertisementByCompanyId(Long companyId) throws Exception{
        if(companyId!=null && companyId>0) {
            List<AdvertisementResponse> advertisementResponses = advertisementService.getAllAdvertisementByCompanyId(companyId);
            return advertisementResponses;
        }
        else {
            throw new RuntimeException(" company not valid ");

        }
    }

}
