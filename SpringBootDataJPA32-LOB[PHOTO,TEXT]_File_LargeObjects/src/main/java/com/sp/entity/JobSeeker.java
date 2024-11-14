package com.sp.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@SuppressWarnings("serial")
@Entity
@Table(name = "JobSeeker")
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker implements Serializable {
	@Id
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer jobId;

	@lombok.NonNull
	@Column(length = 30)
	private String jobHolderName;

	@lombok.NonNull
	@Column(length = 30)
	private String jobDesignation;

	@lombok.NonNull
	private String jobHolderPhnNo;

	@lombok.NonNull
	@Column(length = 50)
	private String jobHolderAddr;

	@Lob
	@lombok.NonNull
	private byte[] jobHolderPhoto;

	@Lob
	@lombok.NonNull
	private char[] jobHolderResume;

	@lombok.NonNull
	private Boolean jobHolderIndian;
}
