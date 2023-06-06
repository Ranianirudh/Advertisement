package com.acro.adv.service;

import com.acro.adv.model.Content;

import java.util.List;

public interface ContentService {
    Content saveContent(Content content);
    Content getContentByName(Content content);
    Content createContent(Long companyId,String idea, String type);

    List<Content> saveContent(List<Content> contents, Long companyId);
}
