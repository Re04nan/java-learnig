package exercise;

public class Recursividade {

	public static void main(String[] args) {
		String[] names = new String[] {
			"Harry Potter", "Hermione Granger", "Ronald Weasley", "Gina Weasley", "Severo Snape" 
		};
		
		listNames(names);
	}
	static void listNames(String[] people) {
		listRecursive(people, 0);
	}
	static void listRecursive (String[] people, Integer counter) {
		print(people[counter] + "\n");
		
		if(++counter < people.length) {
			listRecursive(people, counter);
		}
	}
	static void print(String text) {
		System.out.print(text);
	}
}
