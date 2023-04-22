package contactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	ContactService testService = new ContactService();
	
	@Test
	void testAddTasks() {
		testService.addContact("id", "Jane", "Doe", "9999999999", "description");
		assertSame(false, testService.contactStorage.isEmpty());
	}
	
	@Test
	void testDeleteTasks() {
		testService.addContact("id", "Jane", "Doe", "9999999999", "description");
		testService.deleteContact("id");
		assertSame(true, testService.contactStorage.isEmpty());
	}
	
	@Test
	void testUpdateTasks() {
		testService.addContact("id", "Jane", "Doe", "9999999999", "description");
		testService.updateContact("id");

	}

}
