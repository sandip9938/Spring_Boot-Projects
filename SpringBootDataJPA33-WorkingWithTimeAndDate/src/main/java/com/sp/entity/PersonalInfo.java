package com.sp.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Personal_Info")
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class PersonalInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personal_info_seq")
    @SequenceGenerator(name = "personal_info_seq", sequenceName = "personal_info_seq", allocationSize = 1)
    private Integer pId; // Primary Key

    @lombok.NonNull
    @Column(length = 30, nullable = false) // Added `nullable = false` for better schema consistency
    private String pName;

    @lombok.NonNull
    @Column(nullable = false, unique = true) // Assuming phone numbers should be unique
    private String pPhnNo;

    @lombok.NonNull
    @Column(length = 50, nullable = false)
    private String pAddr;

    @lombok.NonNull
    @Column(nullable = false)
    private LocalDate pDob; // Date of Birth

    @lombok.NonNull
    @Column(nullable = false)
    private LocalTime pTob; // Time of Birth

    @lombok.NonNull
    @Column(nullable = false)
    private LocalDateTime pDoj; // Date of Joining
}

