package com.mikal.nepwebhms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikal.nepwebhms.entities.Admin;
import com.mikal.nepwebhms.repositories.AdminRepository;

@Service
public class AdminServiceImplementation implements AdminService{
	
	private AdminRepository adminRepository;

	//inject employee dao
	@Autowired   //Adding bean id @Qualifier
	public AdminServiceImplementation( AdminRepository obj)
	{
		adminRepository=obj;
	}
	
	@Override
	public List<Admin> findAll() {
		return adminRepository.findAll();
	}

	@Override
	public void save(Admin admin)
	{
		
		adminRepository.save(admin);
	}

	@Override
	public Admin findByEmail(String user) {
		// TODO Auto-generated method stub
		
		return adminRepository.findByEmail(user);
		
	}

	@Override
	public List<Admin> findByRole(String user) {
		
		return adminRepository.findByRole(user);
	}

}
