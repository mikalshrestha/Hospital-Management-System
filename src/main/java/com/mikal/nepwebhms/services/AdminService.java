package com.mikal.nepwebhms.services;

import java.util.List;

import com.mikal.nepwebhms.entities.Admin;

public interface AdminService {
	
	public List<Admin> findByRole(String user);

	public Admin findByEmail(String user);
	
	public List<Admin> findAll();

	public void save(Admin admin);

}
