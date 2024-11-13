package com.sp.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BankAccount")
@Data
@NoArgsConstructor
public class BankAccount {
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "acno_seq", initialValue = 2000000000, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private long acno;

	@Column(length = 30)
	@NonNull
	private String acHolderName;

	@NonNull
	private double balance;

	@Version
	private int modificationCount;

	@CreationTimestamp
	@Column(insertable = true, updatable = false)
	private LocalDate openingDate;

	@UpdateTimestamp
	@Column(insertable = false, updatable = true)
	private LocalDate lastlyOperatedDate;
}
