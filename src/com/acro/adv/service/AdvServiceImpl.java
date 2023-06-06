/*package com.acro.adv.service;

import com.acro.adv.request.AdvRequest;
import com.acro.adv.model.Advertisement;
import com.acro.adv.model.Content;
import com.acro.adv.repository.AdvRepository;
import com.acro.adv.repository.AdvRepositoryImpl;

public class AdvServiceImpl implements AdvService {
    AdvRepository advRepository=new AdvRepositoryImpl();
    ContentService contentService=new ContentServiceImpl();
    public Advertisement publishContent(AdvRequest advRequest) {
        try {
        if (advRequest != null) {
            // public Content(String contentName, String contentFile, LocalDate createdDate,
            //                   String contentType,double contentDuration, Long companyId, Long staffId, boolean isInternal) {
            //

            Content input = new Content(advRequest.getContentName(), advRequest.getContentFile(),advRequest.getCreatedDate(),
                    advRequest.getContentType(),advRequest.getContentDuration(),advRequest.getCompanyId(),1l,false);
            Content savedContent = contentService.getContentByName(input); // Already content unda? fetch
            if (savedContent == null) { // check
                System.out.println("create content");
                savedContent = contentService.saveContent(input); //create
            }
            if (savedContent != null) {
                // Advertisement(String advName, Long companyId, Long contentId, LocalDate publishedDate)
                Advertisement advertisement = new Advertisement(savedContent.getContentName(),
                        savedContent.getCompanyId(), savedContent.getContentId(), advRequest.getPublishedDate());

                Advertisement advertisement1 = createAdvertisement(advertisement);
                System.out.println("saved successfully" + savedContent.getContentName());
                return advertisement1;
            }
        }
            return null;
        } catch (Exception ex) {

            throw new RuntimeException(ex);
        }
    }
    public Advertisement createAdvertisement(Advertisement advertisement) {
        return advRepository.createAdvertisement(advertisement);
    }


}*/
