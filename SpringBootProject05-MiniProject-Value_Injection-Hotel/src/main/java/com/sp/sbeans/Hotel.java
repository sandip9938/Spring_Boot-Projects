package com.sp.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotell")
public class Hotel {

    // Hotel Details
    @Value("${hotel.id}")
    private Integer hotelId;
    @Value("${hotel.name}")
    private String hotelName;
    @Value("${hotel.addr}")
    private String hotelAddres;
    @Value("${hotel.cont}")
    private String hotelContact;

    // Customer Details
    @Value("${customer.name}")
    private String custName;

    // Update the field names to match the MenuItem bean
    @Value("#{menu.muttonBiryaniPrice + menu.chickenBiryaniPrice}")
    private Float biil;

    @Override
    public String toString() {
        return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddres=" + hotelAddres
                + ", hotelContact=" + hotelContact + ", custName=" + custName + ", biil=" + biil + "]";
    }
}
