package listadinamica;

public class Alunos {
	
	String name;
	
	boolean compare(Alunos students) {
		if(students == null) {
			return false;
		}
		return name.compareTo(students.name) > 0;
	}
}
