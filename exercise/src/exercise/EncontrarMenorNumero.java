package exercise;

public class EncontrarMenorNumero {

	public static void main(String[] args) {
		
		Integer[] numbersList = new Integer[] {
				100, 1, 5, -3, 200, 10, 3, 8, 7, 0
		};
		
		Integer counter = 0;
		Integer biggerNumber = null;
		Integer smallerNumber = null;
		Integer assistantNumber = null;
		
		while(counter < numbersList.length) {
			if (numbersList[0] < numbersList[counter]) {
				smallerNumber = numbersList[0];
				biggerNumber = numbersList[counter];
				assistantNumber = smallerNumber;
			} else {
				smallerNumber = numbersList[counter];
				biggerNumber = numbersList[0];
				assistantNumber = smallerNumber;
			}
			counter++;
		}
			if(smallerNumber < biggerNumber) {
				System.out.println("O menor número é " + smallerNumber);
			} else {
				System.out.println("O menor número é " + biggerNumber);
			}
	}

}
