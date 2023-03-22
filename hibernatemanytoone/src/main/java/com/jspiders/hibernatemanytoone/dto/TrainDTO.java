package com.jspiders.hibernatemanytoone.dto;
	import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
	@Entity
	@Data
	public class TrainDTO {
		@Id
	private int id;
	private String train_name;
	private int train_no;
	}

