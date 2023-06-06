package com.acro.adv.service;

import com.acro.adv.model.Content;
import com.acro.adv.repository.ContentRepository;
import com.acro.adv.repository.ContentRepositoryImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContentServiceImpl implements ContentService {
        ContentRepository contentRepository = new ContentRepositoryImpl();
        public Content saveContent(Content content) {
            //TODO:
            if(content.getContentFile()!=null && content.getContentName()!=null && content.getCompanyId()!=null){
                return contentRepository.createContent(content);
            }
            return null;
        }


    public Content getContentByName(Content content) {
            if (content.getContentName() != null && content.getCompanyId() != null) {
                Content newlyCreatedContent = contentRepository.getContentByName(content);
                if (newlyCreatedContent != null) {
                    System.out.println("retrieved successfully" + newlyCreatedContent.getContentName());
                    return newlyCreatedContent;

                }
            }
            return null;
        }
       public Content createContent(Long companyId,String idea, String type){
            if(companyId > 0){
                Content content = new Content(idea, idea, LocalDate.now(), type, 5.0, companyId, 1L, true);

                return saveContent(content);
            }
            return null;
        }

    @Override
    public List<Content> saveContent(List<Content> contents, Long companyId) {
            List<Content> result=new ArrayList<>();
        for (Content c:contents) {
            c.setCompanyId(companyId);              //if no company id in content set it from request
            Content content = saveContent(c);
            if(content!=null) {
                result.add(content);
            }
            else {
                System.out.println("content save failed for "+c);
            }

        }
        return result;
    }
}