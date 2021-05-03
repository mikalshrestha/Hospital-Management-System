package com.mikal.nepwebhms.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mikal.nepwebhms.entities.User;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Long>{
	
	User findByEmail(String email);

	User findByConfirmationToken(String confirmationToken);

	List<User> findAll();

}
