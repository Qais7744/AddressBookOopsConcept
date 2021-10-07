package com.bl.addressBookOops;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		
		PersonDetails person = new PersonDetails();
		person.setName("Qais");
		person.setLastName("Bagwan");
		person.setAddress("MahatGalli");
		person.setCity("Nippani");
		person.setState("Karnataka");
		person.setZip(591237);
		person.setPhoneNumber("7744918893");
		person.setEmail("qaisbagwan23@gmail.com");
		System.out.println(person.toString());
	}

}
