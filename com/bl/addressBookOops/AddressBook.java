package com.bl.addressBookOops;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
// Java program to read data of various types using a scanner class.
import java.util.Scanner;

public class AddressBook {
	// we create an object from the ArrayList named contact.
	static ArrayList<PersonDetail> contact = new ArrayList<PersonDetail>();
	public static Scanner scanner = new Scanner(System.in);
	static int menu;
	static Dictionary dictionary = new Hashtable();
	static Hashtable<Integer, ArrayList<PersonDetail>> hashTable = new Hashtable<Integer, ArrayList<PersonDetail>>();

	public static int choice() {
		// Print the value to choice.
		System.out.println(" 0. Exit. ");
		System.out.println(" 1. Add contact. ");
		System.out.println(" 2. Edit contact. ");
		System.out.println(" 3. Delete contact. ");
		menu = scanner.nextInt();
		return menu;
	}

	private static int inputInteger() {
		int integerInput = scanner.nextInt();
		return integerInput;
	}

	public static void main(String[] args) {
		System.out.println("Enter The Number of add Multiple AddressBook");
		int numberOfAddressBook = inputInteger();
		AddDetails addPersonDetail = new AddDetails();
		for (int i = 1; i < numberOfAddressBook; i++) {
			// we use while loop
			menu = choice();
			while (menu != 0) {
				if (menu > 1)
					menu = choice();
				// use to switch case to easily add details and edit details.
				switch (menu) {
				case 1:
					while (menu != 2) {

						System.out.println("Enter First Name: ");
						String firstName = scanner.next();
						System.out.println("Enter Last Name: ");
						String lastName = scanner.next();
						System.out.println("Enter Address: ");
						String address = scanner.next();
						System.out.println("Enter City: ");
						String city = scanner.next();
						System.out.println("Enter State: ");
						String state = scanner.next();
						System.out.println("Enter a zipCode: ");
						String zipCode = scanner.next();
						System.out.println("Enter PhoneNumber: ");
						String phoneNumber = scanner.next();
						System.out.println("Enter email: ");
						String email = scanner.next();
						PersonDetail personDetail = new PersonDetail(firstName, lastName, address, city, state, zipCode,
								phoneNumber, email);
						contact.add(personDetail);
						System.out.println("Would you like to add someone else? 1: Yes, 2: No");
						menu = scanner.nextInt();
					}
					break;

				case 2:
					System.out.println("Enter First Name of contact that you would like to edit: ");
					addPersonDetail.editContact(contact);
					break;

				case 3:
					addPersonDetail.deleteContact(contact);
					break;

				default:
					System.out.println("Complete Process update Contact Details");
					break;

				}
			}
			hashTable.put(i, contact);
		}
		// for loop use to print the data after add or edit data.
		for (int i = 0; i < contact.size(); i++)
			System.out.println(contact.get(i));
		for (int i = 1; i <= hashTable.size(); i++) {
			System.out.println("address book " + i);
			System.out.println(hashTable.get(i));
		}
		{
			System.out.println("Goodbye!");
			System.out.println();
		}
	}
}