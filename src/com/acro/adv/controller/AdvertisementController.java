package com.acro.adv.controller;

import com.acro.adv.request.AdvertisementRequest;
import com.acro.adv.response.AdvertisementResponse;
import com.acro.adv.service.AdvertisementService;
import com.acro.adv.service.AdvertisementServiceImpl;

public class AdvertisementController {
    AdvertisementService advertisementService=new AdvertisementServiceImpl();
    public AdvertisementResponse saveAdvertisement(AdvertisementRequest advertisementRequest)throws Exception {
        if (advertisementRequest != null
                && advertisementRequest.getAdvName() != null
                && advertisementRequest.getContentRequests() != null && advertisementRequest.getContentRequests().size() > 0) {
            AdvertisementResponse response = advertisementService.createAdvertisement(advertisementRequest);
            return response;

        } else {
            throw new RuntimeException("Required fields are not passed");

        }
    }
    public AdvertisementResponse getAdvertisementById(AdvertisementRequest advertisementRequest) throws Exception{
        if(advertisementRequest!=null
                && advertisementRequest.getAdvId()!=null &&advertisementRequest.getAdvId()>0
            && advertisementRequest.getCompanyId()!=null && advertisementRequest.getCompanyId()>0){
            AdvertisementResponse response1= advertisementService.getAdvertisementById(advertisementRequest);
            return response1;
        }else {
            throw new RuntimeException(" required fields are not passed");
        }

    }


}
