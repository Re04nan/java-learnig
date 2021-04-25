package object;

public class Carro {
	public String marca;
	public String cor;
	public String rodas;
	private boolean emMovimento;
	private boolean parado;
	
	public void getEmMovimento() {
		if(this.parado) {
			this.emMovimento = false;
		} else {
			this.emMovimento = true;
		}
	}
	public void getParado() {
		this.parado = true;
	}
	public void setMarca(String mark) {
		this.marca = mark;
	}
	public void setCor(String color) {
		this.cor = color;
	}
	public void setRodas(String wheels) {
		this.rodas = wheels;
	}
	public void getStatus() {
		System.out.printf("**** Status **** \n"
				+ "Marca: %s\n"
				+ "Cor: %s\n"
				+ "Rodas: %s\nEm movimento: %b\n"
				+ "", this.marca, this.cor, this.rodas, this.emMovimento);
	}

}
