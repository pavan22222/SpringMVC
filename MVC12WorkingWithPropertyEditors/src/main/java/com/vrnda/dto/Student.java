package com.vrnda.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
@Data
public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer sid;
	private Integer age;
	private String name;
	private String addr;
	private Character gender='M';
	private String[] hobbies;
	private String[] colors;
	private Date dob;
	private Date doj;
	
	
}
