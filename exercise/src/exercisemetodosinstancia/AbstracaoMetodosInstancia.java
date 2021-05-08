package exercisemetodosinstancia;

public class AbstracaoMetodosInstancia {
	
	String name;
	String lastName;
	String telephone;
	String city;
	
	// método de instância
	String fullName() {
		return name + " " + lastName;
	}
	
	String telephoneDDD() {
		return telephone.substring(0, 2);
	}
}
