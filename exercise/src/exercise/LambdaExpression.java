package exercise;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Consumer;

public class LambdaExpression {

	public static void main(String[] args) {
		
		List<String> countries = new ArrayList<>();
		
		countries.add("Brazil");
		countries.add("U.S.A");
		countries.add("JAPAN");
		
		//System.out.println(countries);
		
//		for (int i = 0; i < countries.size(); i++) {
//			System.out.println(countries.get(i));
//		}
		
//		for (String country : countries) {
//			System.out.println(country);
//		}
		
//		countries.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});
		// Lambda expression
//		countries.forEach(country -> {
//			System.out.println(country);
//		});
//		countries.forEach(country -> System.out.println(country));
		// Method Reference
		countries.forEach(System.out::println);
	}

}
