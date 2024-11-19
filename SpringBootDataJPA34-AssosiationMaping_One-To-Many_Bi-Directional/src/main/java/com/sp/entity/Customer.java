package com.sp.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "JPA_OTM_CUSTOMER")
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Customer {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "CNO_SEQ", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer cNo;
	@Column(length = 30)
	@NonNull
	private String cName;
	@Column(length = 30)
	@NonNull
	private String cAdddr;

	// For building one to Many Association

	@OneToMany(targetEntity = PhoneNo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CNO")
	private Set<PhoneNo> phoneInfo;

	// To string

	@Override
	public String toString() {
		return "Customer [cNo=" + cNo + ", cName=" + cName + ", cAdddr=" + cAdddr + "]";
	}

}
