package exercise;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		Boolean testOne = 4 < 2;
		System.out.println("4 < 2? " + testOne);
		
		Boolean testTwo = 4 > 2;
		System.out.println("4 > 2? " + testTwo);
		
		Boolean testThree = 4 <= 2;
		System.out.println("4 <= 2? " + testThree);
		
		Boolean testFour = 4 >= 2;
		System.out.println("4 >= 2? " + testFour);
		
		Boolean testFive = 4 == 2;
		System.out.println("4 == 2? " + testFive);
		
		Boolean testSix = 4 != 2;
		System.out.println("4 != 2? " + testSix);
		
		Integer numberOne = 4;
		Boolean testSeven = numberOne.equals(numberOne);
		System.out.println("4 == 4? " + testSeven);
		
		Integer numberTwo = 2;
		Boolean testEight = numberTwo.equals(numberOne);
		System.out.println("2 == 4? " + testEight);
		
		Integer numberTest = 128;
		Boolean testNine = numberTest.equals(numberTest);
		System.out.println("128 == 128? " + testNine);
		// quando o n° for maior que 127 procurar usar o equals
		Boolean testTen = numberTest == numberTest;
		System.out.println("128 == 128? " + testTen);
		
	}

}
