package com.acro.adv.repository;

import com.acro.adv.model.Advertisement;
import com.acro.adv.model.Content;

import java.util.List;

public interface AdvRepository {
    Advertisement createAdvertisement(Advertisement advertisement);

    Advertisement getAdvertisementByName(String advName, long companyId);

    Advertisement getAdvertisementById(Long advId, Long companyId);
    List<Content> getContentByAdvertisementId(Long avdId, Long companyId);

    List<Advertisement> getAdvertisementByCompanyId(Long companyId);

}
