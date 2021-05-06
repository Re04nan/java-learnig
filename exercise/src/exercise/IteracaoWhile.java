package exercise;

public class IteracaoWhile {

	public static void main(String[] args) {
		
		Integer counter = 1;
		
//		while(counter <= 10) {
//			System.out.println(counter + "° repetição.");
//			counter++;
//		}
		
		while(counter <= 10) {
			if (counter.equals(6)) {
				System.out.println("Hora do intervalo!");
				counter++;
				continue;
			}
			
			System.out.println(counter + "° repetição.");
			counter++;
		}
		
	}

}
