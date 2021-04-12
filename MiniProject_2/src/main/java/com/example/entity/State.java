package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="state_tbl")
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer state_id;
	private String state_name;

}
