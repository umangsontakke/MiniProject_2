package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="country_tbl")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer country_id;
	private String country_name;
	
}
