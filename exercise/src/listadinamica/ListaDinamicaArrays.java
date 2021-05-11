package listadinamica;

public class ListaDinamicaArrays {

	public static void main(String[] args) {
		
		ListarAlunos students = new ListarAlunos();
		
		Alunos studentOne = new Alunos();
		studentOne.name = "João";
		students.add(studentOne);
		
		Alunos studentTwo = new Alunos();
		studentTwo.name = "Maria";
		students.add(studentTwo);
		
		Alunos studentThree = new Alunos();
		studentThree.name = "Alexandre";
		students.add(studentThree);
		
		Alunos studentFour = new Alunos();
		studentFour.name = "Normandes";
		students.add(studentFour);
		
		Alunos studentFive = new Alunos();
		studentFive.name = "Thiago";
		students.add(studentFive);
		
		listView(students);
		
		students.order();
		
		listView(students);
		
		students.remove(studentThree);

		listView(students);
	}
	
	static void listView(ListarAlunos students) {
		for (int i = 0; i < students.size(); i++) {
			Alunos value = students.take(i);
			
			if(value != null) {
				System.out.println("Aluno: " + value.name);
			} else {
				System.out.println("Nome não informado!");
			}
		}
		System.out.println("----------------------");
	}

}
