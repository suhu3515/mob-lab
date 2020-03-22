package com.laboratory.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Pickup {

	int id;
	String pi_name;
	String pi_mail;
	long pi_mob;
	int pi_age;
	String pi_place;
	String pi_addr;
	String pass;
	int stat;
	
}