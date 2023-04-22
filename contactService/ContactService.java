package contactService;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactService {
	ArrayList<Contact> contactStorage = new ArrayList<Contact>();
	//find the right contact given a contact id
	private int findContactPlace(String contactId) {
		int place = -1;
		  for (int i = 0; i < contactStorage.size(); i ++) {
			    if (contactStorage.get(i).getContactId() == contactId) {
			    	return i;
			    }
			  }
		return place;
	}
	public void addContact(String contactId, String firstName, String lastName, String phone, String address) {
		Contact newContact = new Contact(contactId, firstName, lastName, phone, address);
		contactStorage.add(newContact);
	}
	
	public void deleteContact(String contactId) {
		int contactPlace = findContactPlace(contactId);
		contactStorage.remove(contactPlace);
	}
	public void updateContact(String contactId) {
		int contactPlace = findContactPlace(contactId);
		Contact contactToChange = contactStorage.get(contactPlace);
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Which value would you like to update?");
		System.out.println("1: first name");
		System.out.println("2: last name");
		System.out.println("3: Number");
		System.out.println("4: Address");
		

		int userChoice = myObj.nextInt();
		myObj.nextLine();		
		System.out.println("What would you like to change it to?");
		String userChange = myObj.nextLine();
		switch (userChoice) {
		case 1: 
			contactToChange.setFirstName(userChange);
			break;
		case 2: 
			contactToChange.setLastName(userChange);
			break;
		case 3: 
			contactToChange.setPhone(userChange);
			break;
		case 4: 
			contactToChange.setAddress(userChange);
			break;
		default:
			System.out.println("This is an invalid entry. Please select an option.");
			break;
		}
	}
}
