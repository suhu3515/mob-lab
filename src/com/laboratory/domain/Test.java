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

public class Test {

	int id;
	String testname;
	String testtype;
	String ref_dr;
	int obs_val;
	int req_val;
	String observation;
	Laboratory lab;
	Patient patient;
	int stat;
}
