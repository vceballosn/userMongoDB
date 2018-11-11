package com.userCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userCrud.model.User;
import com.userCrud.repository.UserRepository;

@Service
public class UserService {
    
	@Autowired
	private UserRepository userRepository;
	
	// create operation 
	
	public User create(String idCar, String firstName, String address,int age, String lastName) {
		
		return userRepository.save(new User(idCar,firstName,address,age,lastName));
	} 
	// all user
	public List<User> getAll(){
		return userRepository.findAll();
	}
	
	// find idCar
	public User findByIdCar (String idCar) {
		return userRepository.findByIdCar(idCar);
		
	}
	
	// update user
    public User update(String idCar, String firstName, String address,int age, String lastName) {
		User userUpdate = userRepository.findByIdCar(idCar);
		userUpdate.setFirstName(firstName);
		userUpdate.setAddress(address);
		userUpdate.setAge(age);
		userUpdate.setLastName(lastName);
		return userRepository.save(userUpdate);
	} 
    
    // delete all
    
    public void deleteAll() {
    	userRepository.deleteAll();
    }
    
    // delete by idCar
    
    public void deleteByidCar(String idCar) {
    	
    	User userDelete = userRepository.findByIdCar(idCar);
    	userRepository.delete(userDelete);
    }
	
}
