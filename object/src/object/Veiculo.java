package object;

public class Veiculo {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		
		c.setMarca("Hyundai");
		c.setCor("Prata");
		c.setRodas("4 rodas em perfeito estado.");
		
		c.getParado();
		c.getEmMovimento();
		c.getStatus();
	
	}

}
