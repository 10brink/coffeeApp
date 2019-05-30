package co.grandcircus.coffeeshop;

import org.springframework.stereotype.Component;

@Component //we will let spring do some dependency injection
// this will be used in conjuction with @autowired annotation in our controller class
public class person {
	private String firstName;
	private String lastName;
	private String email = null;
	private int id;
	
	
	public person() {}
	
	public person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public person(String firstName, String lastName, String email, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
