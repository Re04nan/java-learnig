package exercise;

public class OperadoresIncrementoDecremento {

	public static void main(String[] args) {
		Integer number = 6;
		
		System.out.println(number); // 6
		System.out.println(number++); // 6 s� vai somar +1 ap�s impress�o
		System.out.println(number--); // 7 devido ao incremento anterior e na pr�xima vai ocorrer o decremento.
		System.out.println(--number); // 5 foi decrementado o -1 anterior e o -1 de agora
		System.out.println(++number); // 6 foi incrementado +1
	}

}
