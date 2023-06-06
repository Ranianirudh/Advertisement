package com.acro.adv.service;

import com.acro.adv.request.AdvRequest;
import com.acro.adv.model.Advertisement;

public interface AdvService {
    Advertisement publishContent(AdvRequest advRequest);
    Advertisement createAdvertisement(Advertisement advertisement);
}
