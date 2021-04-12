package com.example.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="registration_tbl")
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userid;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private String phn_no;
	private String dob;
	private String gender;
	private String country;
	private String state;
	private String city;
}
