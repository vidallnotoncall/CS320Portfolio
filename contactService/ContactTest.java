package contactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactTest {
	
	@Test
	void test() {
		System.out.println("Testing...");
	}
	
	//Null Tests
	@Test
	void TestIdNull() {
		assertThrows(NullPointerException.class,()->{
			Contact testContactNull = new Contact(null, "Jane", "Doe", "9999999999", "description");
		});
	}
	@Test
	void TestFirstNameNull() {
		assertThrows(NullPointerException.class,()->{
			Contact testContactNull = new Contact("id", null, "Doe", "9999999999", "description");
		});
	}
	@Test
	void TestLastNameNull() {
		assertThrows(NullPointerException.class,()->{
			Contact testContactNull = new Contact("id", "Jane", null, "9999999999", "description");
		});
	}
	@Test
	void TestPhoneNull() {
		assertThrows(NullPointerException.class,()->{
			Contact testContactNull = new Contact("id", "Jane", "Doe", null, "description");
		});
	}
	@Test
	void TestAdressNull() {
		assertThrows(NullPointerException.class,()->{
			Contact testContactNull = new Contact("id", "Jane", "Doe", "9999999999", null);
		});
	}
	
	//String length Tests
	@Test
	void TestIdLength() {
		assertThrows(RuntimeException.class,()->{
			Contact testContactString = new Contact("abcdefghijklmnopqrstuv", "Jane", "Doe", "9999999999", "description");
		});
	}
	@Test
	void TestFirstNameLength() {
		assertThrows(RuntimeException.class,()->{
			Contact testContactString = new Contact("id", "abcdefghijklmnopqrstuv", "Doe", "9999999999", "description");
		});
	}
	@Test
	void TestLastNameLength() {
		assertThrows(RuntimeException.class,()->{
			Contact testContactString = new Contact("id", "Jane", "abcdefghijklmnopqrstuv", "9999999999", "description");
		});
	}
	@Test
	void TestPhoneLength() {
		assertThrows(RuntimeException.class,()->{
			Contact testContactString = new Contact("id", "Jane", "Doe", "abcdefghijklmnop", "description");
		});
	}
	@Test
	void TestAdressLength() {
		assertThrows(RuntimeException.class,()->{
			Contact testContactString = new Contact("id", "Jane", "Doe", "9999999999", "abcdefghijklmnopqrstuvwxyzabcdefghijklmnop");
		});
	}
}
