package exercise;

public class EncontrarMenorNumero {

	public static void main(String[] args) {
		
		Integer[] numbersList = new Integer[] {
				100, 1, 5, -3, 200, 10, 3, 8, 7, 0
		};
		
		Integer counter = 0;
		Integer smallerNumber = Integer.MAX_VALUE;
		
		while(counter < numbersList.length) {
			if (smallerNumber > numbersList[counter]) {
				smallerNumber = numbersList[counter];
			}
			counter++;
		}
		
		System.out.println("O menor número é " + smallerNumber);
		
	}

}
