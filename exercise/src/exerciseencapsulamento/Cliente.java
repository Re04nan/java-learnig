package exerciseencapsulamento;

public class Cliente {
	
	private String firstName;
	private String lastName;
	private String city;
	
	String getFullName() {
		return firstName + " " + lastName;
	}
	String getFirstName() {
		return firstName;
	}
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	String getLastName() {
		return lastName;
	}
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	String getCity() {
		return city;
	}
	void setCity(String city) {
		this.city = city;
	}
	
	
}
