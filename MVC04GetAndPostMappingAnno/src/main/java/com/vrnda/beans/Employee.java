package com.vrnda.beans;

import java.util.Date;

import lombok.Data;
@Data
public class Employee {
	private Integer id;
	private String name;
	private Float salary;
	private Date doj;
	private String designation;
}
