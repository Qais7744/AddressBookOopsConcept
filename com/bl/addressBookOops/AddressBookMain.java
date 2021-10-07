package com.bl.addressBookOops;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		
		PersonDetails person = new PersonDetails();
		person.Name("Qais");
		person.LastName("Bagwan");
		person.Address("MahatGalli");
		person.City("Nippani");
		person.State("Karnataka");
		person.Zip(591237);
		person.PhoneNumber("7744918893");
		person.Email("qaisbagwan23@gmail.com");
		System.out.println(person.toString());
	}

}
