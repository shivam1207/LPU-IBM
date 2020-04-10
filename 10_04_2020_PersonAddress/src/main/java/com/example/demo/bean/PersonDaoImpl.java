package com.example.demo.bean;

public class PersonDaoImpl implements PersonDao{

	
	public String getPersonInfo(Person person) {
		// TODO Auto-generated method stub
		
		return "Name:" + person.getName() + "\n" + "Age:" + person.getAge() + "\n"
        + "Height: " + person.getHeight() + "\n" + "Is Programmer?: "
        + person.isIsprogrammer() + "\n" + "Address: "
        + person.getAddress().getStreetNumber() + " "
        + person.getAddress().getStreetName() + " "
        + person.getAddress().getCity() + " "
        + person.getAddress().getCountry();
	}
	

}
