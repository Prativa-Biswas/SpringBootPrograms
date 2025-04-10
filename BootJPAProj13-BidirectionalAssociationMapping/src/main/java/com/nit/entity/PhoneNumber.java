package com.nit.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="JPA_PHONE_NUMBER")
@Getter
@Setter
//@NoArgsConstructor
@RequiredArgsConstructor
public class PhoneNumber {
	public PhoneNumber() 
	{
		System.out.println("Child::PhoneNumber:: 0 Arg Constructor");
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer regId;
	@NonNull
	private Long phoneNumber;
	@Column(length = 20)
	@NonNull
	private String provider;
	@Column(length = 20)
	@NonNull
	private String phoneType;
	
	@ManyToOne(targetEntity = Customer.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)//by default fetcHtype=EAGER
	@JoinColumn(name="CUSTOMER_ID",referencedColumnName ="cno")
	private Customer cust;

	//toString method
	@Override
	public String toString() {
		return "PhoneNumber [regId=" + regId + ", phoneNumber=" + phoneNumber + ", provider=" + provider
				+ ", phoneType=" + phoneType + "]";
	}
	
	
}
