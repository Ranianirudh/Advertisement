package com.acro.adv;

import com.acro.adv.controller.AdvertisementController;
import com.acro.adv.request.AdvertisementRequest;
import com.acro.adv.request.ContentRequest;
import com.acro.adv.response.AdvertisementResponse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    AdvertisementController advertisementController=new AdvertisementController();

    public static void main(String[] args) {
        Main test = new Main();
        try {
            //AdvertisementRequest advertisementRequest = test.createAdvertisementRequest();
            //test.advertisementController.saveAdvertisement(advertisementRequest);

            AdvertisementRequest advertisementRequest= new AdvertisementRequest();
            advertisementRequest.setAdvId(5L);
            advertisementRequest.setCompanyId(1L);
            AdvertisementResponse advertisementById = test.advertisementController.getAdvertisementById(advertisementRequest);

            System.out.println(advertisementById);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    private AdvertisementRequest createAdvertisementRequest(){
        AdvertisementRequest advertisementRequest=new AdvertisementRequest();
        List<ContentRequest> contentRequest=new ArrayList<>() ;
        advertisementRequest.setAdvName("Colgate Cavity Protection");
        advertisementRequest.setCompanyId(1L);
        advertisementRequest.setPublishedDate(LocalDate.now());
        contentRequest.add(createContentRequest());
        advertisementRequest.setContentRequests(contentRequest);
        return advertisementRequest;

    }
    private ContentRequest createContentRequest(){
        ContentRequest contentRequest=new ContentRequest();
        contentRequest.setContentName(" max Fresh ad");
        contentRequest.setContentDuration( 1.0D);
        contentRequest.setContentFile("C:\\Users\\kulka\\Downloads ");
        contentRequest.setContentType(" Image ");
        contentRequest.setCreatedDate(LocalDate.now());
        contentRequest.setCompanyId(1L);
        contentRequest.setStaffId(1L);
        return contentRequest;


    }



}
