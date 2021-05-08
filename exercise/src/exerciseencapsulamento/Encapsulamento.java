package exerciseencapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
		
		Cliente client = new Cliente();
		
		client.setFirstName("Harry");
		client.setLastName("Potter");
		client.setCity("Londres");
		
		System.out.println("Nome completo: " + client.getFullName());

	}

}
