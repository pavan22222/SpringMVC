package com.vrnda.dto;

import java.util.Date;

import lombok.Data;
@Data
public class Employee {
	private Integer id;
	private Integer dno;
	private String name;
	private Integer age;
	private Float salary;
	private Date doj;
	
}
