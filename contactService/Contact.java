package contactService;

import java.util.Objects;

public class Contact {
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;	
	//constructor 
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		this.contactId = this.contactId == null ? contactId : preventUpdate();
		if (contactId.length() <= 0 || contactId.length() > 10) {
			throw new RuntimeException("contactId cannot be more than 10 characters or empty");
		}  
		this.contactId = Objects.requireNonNull(contactId, "Id cannot be null");
		
		if (firstName.length() <= 0 || firstName.length() > 10) {
			throw new RuntimeException("firstName cannot be more than 10 characters");
		}  
		this.firstName = Objects.requireNonNull(firstName, "First name cannot be null");
		
		if (lastName.length() <= 0 || lastName.length() > 10) {
			throw new RuntimeException("lastName cannot be more than 10 characters");
		}  
		this.lastName = Objects.requireNonNull(lastName, "Last name cannot be null");
		
		if (phone.length() != 10) {
			throw new RuntimeException("phone number must be 10 characters");
		}  
		this.phone = Objects.requireNonNull(phone, "Phone number cannot be null");
		
		if (address.length() <= 0 || address.length() > 30) {
			throw new RuntimeException("address cannot be more than 30 characters");
		}  
		this.address = Objects.requireNonNull(address, "address cannot be null");
		

	}	
	public String getContactId() {
		return contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}

	//used to prevent the contact id from being updated once set
	public String preventUpdate() {
		String msg = "Id is not updatable once set";
		throw new RuntimeException(msg);
	}
	public void setFirstName(String firstName) {
		if (firstName.length() <= 0 || firstName.length() > 10) {
			throw new RuntimeException("firstName cannot be more than 10 characters");
		}  
		this.firstName = Objects.requireNonNull(firstName, "First name cannot be null");
	}
	public void setLastName(String lastName) {
		if (lastName.length() <= 0 || lastName.length() > 10) {
			throw new RuntimeException("lastName cannot be more than 10 characters");
		}  
		this.lastName = Objects.requireNonNull(lastName, "Last name cannot be null");
	}
	public void setPhone(String phone) {
		if (phone.length() != 10) {
			throw new RuntimeException("phone number must be 10 characters");
		}  
		this.phone = Objects.requireNonNull(phone, "Phone number cannot be null");
	}
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new RuntimeException("address cannot be more than 30 characters");
		}  
		this.address = Objects.requireNonNull(address, "address cannot be null");
	}


}
