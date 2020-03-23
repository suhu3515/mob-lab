package com.laboratory.dao;

import java.util.List;

import com.laboratory.domain.PickTask;


public interface PickTaskDao {

	
	public int savePickTask(PickTask task);
	
	public boolean updatePickTask(PickTask task);
	
	public PickTask findPickTaskById(int id);
	
	public List<PickTask> findAllPickTask();
	
	public boolean deletePickTask(int id);
	
}
