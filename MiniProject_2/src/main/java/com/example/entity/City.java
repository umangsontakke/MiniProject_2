package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="city_tbl")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer city_id;
	private String city_name;
	
}
