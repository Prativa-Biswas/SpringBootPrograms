package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="JOB_SEEKERS")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class JobSeekers {
	
	@Id
	@SequenceGenerator(name = "gen1",sequenceName="job_seq",initialValue =100,allocationSize =2)
	@GeneratedValue(generator="gen1",strategy =GenerationType.SEQUENCE )
	private Integer jsId;
	@Column(length = 30)
	@NonNull
	private String jsName;
	@Column(length = 30)
	@NonNull
	private String jsAddress;
	@NonNull
	private Boolean jsIndian;
	
	@Lob
	@NonNull
	private byte[] jsPhoto;
	@Lob
	@NonNull
	private char[] jsResume;

}
