package com.userCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.userCrud.model.User;
import com.userCrud.service.UserService;
// autor vladimir ceballos
@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/create")
	public String create(@RequestParam String idCar,@RequestParam String firstName, @RequestParam String address, @RequestParam int age, @RequestParam String lastName ) {
	 User user = userService.create(idCar, firstName, address, age, lastName);
	 return user.toString();
	}
	
	@RequestMapping("/getIdCar")
	public User getIdCar(@RequestParam String idCar) {
	 return userService.findByIdCar(idCar);
	}
	
	@RequestMapping("/getAll")
	public List<User> getAll() {
	 return userService.getAll();
	}
	
	
	@RequestMapping("/update")
	public String update(@RequestParam String idCar,@RequestParam String firstName, @RequestParam String address, @RequestParam int age, @RequestParam String lastName ) {
	 User userUpdate= userService.update(idCar, firstName, address, age, lastName);
	 return userUpdate.toString();
	}
	
	@RequestMapping("/delete")
	
	public String delete (@RequestParam String idCar) {
		userService.deleteByidCar(idCar);
		return idCar;
	}
	
@RequestMapping("/deleteAll")
	
	public String deleteAll () {
		userService.deleteAll();
		return "delete all records";
	}
}
