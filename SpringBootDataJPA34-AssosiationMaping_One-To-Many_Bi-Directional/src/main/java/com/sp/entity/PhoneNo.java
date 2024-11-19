package com.sp.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "JPA_OTM_PHONENO")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class PhoneNo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer regNo;
	@Column(length = 30)
	@NonNull
	private String phoneNo;
	@Column(length = 30)
	@NonNull
	private String provider;
	@Column(length = 30)
	@NonNull
	private String numberType;

	// For building Many to One Association
	@ManyToOne(targetEntity = Customer.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CNO")
	private Customer customer;

//
	// To String
	@Override
	public String toString() {
		return "PhoneNo [regNo=" + regNo + ", phoneNo=" + phoneNo + ", provider=" + provider + ", numberType="
				+ numberType + "]";
	}

}
