package listadinamica;

public class ListarAlunos {
	
	static final int QUANTITY_LIST = 2;
	
	Alunos[] studentsList = new Alunos[QUANTITY_LIST];
	
	int sizeList = 0;
	
	Alunos take(int indice) {
		return studentsList[indice];
	}
	
	int size() {
		return sizeList;
	}
	
	void add(Alunos students) {
		if (sizeList == studentsList.length) {
			Alunos[] newList = new Alunos[QUANTITY_LIST + studentsList.length];
			
			for (int i = 0; i < studentsList.length; i++) {
				newList[i] = studentsList[i];
			}
			
			studentsList = newList;
		}
		
		studentsList[sizeList] = students;
		sizeList++;
	}
	
	void remove(Alunos students) {
		
		for (int i = 0; i < sizeList; i++) {
			Alunos value = studentsList[i];
			
			if(value != null && value.equals(students)) {
				getDelete(i);
				break;
			} else if(value == null && students == null) {
				getDelete(i);
				break;
			}
		}	
	}
	private void getDelete(int indice) {
		int initial = indice + 1;
		
		for (int i = initial; i < sizeList; i++ ) {
			studentsList[i - 1] = studentsList[i];
		}
		sizeList--;
		studentsList[sizeList] = null;
	}
	
	void order() {
		for (int i = 1; i < sizeList; i++) {
			Alunos baseStudent = studentsList[i];
			
			int indiceBase = i;
			
			while (indiceBase > 0){
				int indicePrevious = indiceBase - 1;
				Alunos basePrevious = studentsList[indicePrevious];
				
				Boolean verify = basePrevious == null || basePrevious.compare(baseStudent);
				if(verify) {
					studentsList[indiceBase] = studentsList[indicePrevious];
					indiceBase--;
				} else {
					break;
				}
			}
			studentsList[indiceBase] = baseStudent;
		}
	}

}
