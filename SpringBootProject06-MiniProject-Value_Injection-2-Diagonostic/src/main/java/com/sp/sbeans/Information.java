package com.sp.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("info")
public class Information {
    @Value("${pi.id}")
    private Integer patientId;
    @Value("${pi.name}")
    private String patientName;
    @Value("${pi.addr}")
    private String patientMobileno;
    @Value("${pi.mobileno}")
    private String patientAdd;

    // Reference to the "dc" bean for calculating patientBill
    @Value("#{dc.mriScanPrice + dc.ecgPrice + dc.xrayPrice}")
    private Float patientBill;

    @Override
    public String toString() {
        return "Information [patientId=" + patientId + ", patientName=" + patientName + ", patientMobileno="
                + patientMobileno + ", patientAdd=" + patientAdd + ", patientBill=" + patientBill + "]";
    }
}
