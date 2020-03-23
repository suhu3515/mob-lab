package com.laboratory.dao;

import java.util.List;

import com.laboratory.domain.Laboratory;

public interface LaboratoryDao {

	public int saveLaboratory(Laboratory lab);
	
	public boolean updateLaboratory(Laboratory lab);
	
	public Laboratory findLaboratoryById(int id);
	
	public List<Laboratory> findAllLaboratory();
	
	public boolean deleteLaboratory(int id);
	
}
