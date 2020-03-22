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

public class Laboratory {

	int id;
	String l_name;
	String l_owner;
	String l_mail;
	long l_mob;
	String l_place;
	int l_pin;
	String l_dst;

}
