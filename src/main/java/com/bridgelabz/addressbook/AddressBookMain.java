package com.bridgelabz.addressbook;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("---------- Welcome To Address Book Program!! ----------");
		
		AddressBookDirectory addressBookDirectory = new AddressBookDirectory();
        addressBookDirectory.operationDirectory();
        AddressBook addressBook = new AddressBook();
        addressBook.operation();
	}



}
	
	




