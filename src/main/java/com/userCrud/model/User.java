package com.userCrud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ConvertOperators.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
// vladimir ceballos
@Document
public class User {
@Id
String id;
String idCar;
String firstName;
String lastName;
String address;
int age;

public User(String idCar,String firstName,String address,int age,String lastName) {
	this.idCar =idCar; 
	this.firstName = firstName;
	this.address = address;
	this.age= age;
	this.lastName =lastName;
}



public String getIdCar() {
	return idCar;
}

public void setIdCar(String idCar) {
	this.idCar = idCar;
}

public String getLastName() {
	return lastName;
}



public void setLastName(String lastName) {
	this.lastName = lastName;
}



public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "User [id=" + id + ", idCar=" + idCar + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
			+ address + ", age=" + age + "]";
}
}
