package exercisemetodosinstancia;

public class MetodosInstancia {

	public static void main(String[] args) {
		
		AbstracaoMetodosInstancia dataPeopleOne = new AbstracaoMetodosInstancia();
		
		dataPeopleOne.name = "Harry";
		dataPeopleOne.lastName = "Potter";
		dataPeopleOne.telephone = "1123004000";
		dataPeopleOne.city = "Londres";
		
		AbstracaoMetodosInstancia dataPeopleTwo = new AbstracaoMetodosInstancia();
		
		dataPeopleTwo.name = "Hermione";
		dataPeopleTwo.lastName = "Granger";
		dataPeopleTwo.telephone = "2211440000";
		dataPeopleTwo.city = "Paris";
		
		System.out.println("Nome completo: " + dataPeopleOne.fullName() + "\nDDD: " + dataPeopleOne.telephoneDDD());
		System.out.println("Nome completo: " + dataPeopleTwo.fullName() + "\nDDD: " + dataPeopleTwo.telephoneDDD());
	}

}
