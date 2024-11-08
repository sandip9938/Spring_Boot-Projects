package com.sp.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name = "HOTEL_INFO")
@AllArgsConstructor
@RequiredArgsConstructor
public class Hotel {

    @Column(name = "HOTEL_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Changed to IDENTITY for MySQL
    private Integer hotelId;
    
    @NonNull
    @Column(name = "HOTEL_NAME", length = 40)
    private String hotelName;
    
    @NonNull
    @Column(name = "HOTEL_OWNERNAME", length = 40)
    private String hotelOwnerName;
    
    @NonNull
    private String hotelAddr;
    
    @NonNull
    private Long hotelPhoneNo;
}
