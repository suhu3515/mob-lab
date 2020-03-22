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

public class Patient {

	int id;
	String p_name;
	int p_age;
	String p_addr;
	String p_place;
	long p_mob;
	String p_mail;
	String p_pass;
	String p_map;
	int stat;
	
}
