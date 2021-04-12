package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="unlock_acc_tbl")
public class UnlockAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer uaid;
	private String temppass;
	private String pass;

}
