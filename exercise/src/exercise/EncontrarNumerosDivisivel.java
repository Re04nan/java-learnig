package exercise;

public class EncontrarNumerosDivisivel {

	static final Integer NUMBER_DIVIDER = 3;
	
	public static void main(String[] args) {
		
		Integer[] numbersList = new Integer[]{
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
		};
		
		for (int i = 0; i < numbersList.length; i++) {
			Integer verify = numbersList[i] % NUMBER_DIVIDER;
			if (verify.equals(0)) {
				System.out.println("O número " + numbersList[i] + " é divisível por " + NUMBER_DIVIDER + ".");
			}
		}
	}
}
