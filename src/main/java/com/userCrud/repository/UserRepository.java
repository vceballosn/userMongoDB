package com.userCrud.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.userCrud.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	public User findByIdCar (String idCar);
	public List<User> findByAge(int age);

}
