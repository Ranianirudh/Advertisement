package com.acro.adv.repository;

import com.acro.adv.model.Content;

import java.util.List;

public interface ContentRepository {
    Content createContent(Content content);
    Content getContentByName(Content content);

    List<Content> getContentByAdvertisementId(Long advId, Long companyId);
}

