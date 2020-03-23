package com.laboratory.dao;

import java.util.List;

import com.laboratory.domain.Test;

public interface TestDao {

	
	public int saveTest(Test test);
	
	public boolean updateTest(Test test);
	
	public Test findTestById(int id);
	
	public List<Test> findAllTest();
	
	public boolean deleteTest(int id);
	
}
