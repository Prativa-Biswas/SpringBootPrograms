package com.nit.Entity;

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
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Doctor_Tab")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Doctor {
	@Column(name="DOC_ID")
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	/*@SequenceGenerator(name = "doc_seq", sequenceName = "doctor_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doc_seq")
	*/
	private Integer docId;
	@Column(name="DOC_NAME",length=25)
	@NonNull
	private String docName;
	@Column(name="SPECIALIZATION",length=20)
	@NonNull
	private String specialization;
	@Column(name="INCOME")
	@NonNull
	private Double income;

}
