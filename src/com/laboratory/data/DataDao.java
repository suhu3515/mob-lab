package com.laboratory.data;

public interface DataDao {

	final String DB_NAME = "mob_lab";
	final String USERNAME="root";
	final String PASSWORD="qwerty";
	final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	
	public String getDriverName();
	public String getPassword();
	public String getURL();
	public String getUserName();
	
}
