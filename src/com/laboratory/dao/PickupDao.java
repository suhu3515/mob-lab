package com.laboratory.dao;

import java.util.List;

import com.laboratory.domain.Pickup;


public interface PickupDao {

	
	public int savePickup(Pickup pickup);
	
	public boolean updatePickup(Pickup pickup);
	
	public Pickup findPickupById(int id);
	
	public List<Pickup> findAllPickup();
	
	public boolean deletePickup(int id);
}
