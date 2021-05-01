package exercise;

public class TipoLogico {

	public static void main(String[] args) {
		Boolean openStore = true;
		Boolean closeStore = false;
		Boolean hoursLunch = false;
		
		if(openStore) {
			System.out.println("Loja aberta!");
		} else if (closeStore == true && hoursLunch == true) {
			System.out.println("Loja fechada para almoço!");
		} else {
			System.out.println("Loja fechada!");
		}
		
	}

}
