package com.nit.Entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Bank_Account")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class BankAccount {
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName="bank_seq",initialValue =11000000, allocationSize =10)
	@GeneratedValue(generator="gen1",strategy =GenerationType.SEQUENCE)
	private Long accNo;
	@Column(length=30)
	@NonNull
	private String accHolderName;
	@NonNull
	private Double amount;
	
	//versioning & TimeStamp
	@Version
	@Column(name="UPDATED_COUNT")
	private Integer updatedCount;
	
	@CreationTimestamp
	@Column(name="INSERTED_DATE",insertable = true,updatable = false)
	private LocalDateTime creationDate;

	@UpdateTimestamp()
	@Column(name="UPDATED_DATE",insertable = false,updatable = true)
	private LocalDateTime lastlyUpdatedOn;
}
