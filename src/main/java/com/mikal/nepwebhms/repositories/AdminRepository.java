package com.mikal.nepwebhms.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mikal.nepwebhms.entities.Admin;

@Repository("adminRepository")
public interface AdminRepository extends JpaRepository<Admin, Long> {
	
	Admin findByEmail(String user);

	List<Admin> findByRole(String user);

}
