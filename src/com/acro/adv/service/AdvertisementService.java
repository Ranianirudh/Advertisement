package com.acro.adv.service;

import com.acro.adv.request.AdvertisementRequest;
import com.acro.adv.response.AdvertisementResponse;

public interface AdvertisementService {
    AdvertisementResponse createAdvertisement(AdvertisementRequest advertisementRequest);
    AdvertisementResponse getAdvertisementById(AdvertisementRequest advertisementRequest);


}
