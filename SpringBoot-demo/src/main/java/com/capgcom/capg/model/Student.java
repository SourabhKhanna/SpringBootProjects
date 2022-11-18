package com.capgcom.capg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {
	@Id
	private int stid;
	private String stName;
	
}
