package com.jspiders.hibernateonetoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
@Entity

public class PersonDTO {
	@Id
	private int id;
	private String name;
	private String fathers_name;
	private String date_of_birth;
	private long contact;
	private String address;
	@OneToOne
	private AadharDTO aadhar;
	
}
