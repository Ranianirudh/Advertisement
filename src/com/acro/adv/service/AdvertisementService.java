package com.acro.adv.service;

import com.acro.adv.request.AdvertisementRequest;
import com.acro.adv.response.AdvertisementResponse;

import java.util.List;

public interface AdvertisementService {
    AdvertisementResponse createAdvertisement(AdvertisementRequest advertisementRequest);
    AdvertisementResponse getAdvertisementDetails(AdvertisementRequest advertisementRequest);

    AdvertisementResponse getAdvertisementById(Long advId);


    List<AdvertisementResponse> getAllAdvertisementByCompanyId(Long companyId);
}
