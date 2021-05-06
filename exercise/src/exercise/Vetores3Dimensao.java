package exercise;

public class Vetores3Dimensao {

	public static void main(String[] args) {
		// 1D
		String[] listGirls = new String[] {
			"Ino", "Hinata", "Sakura", "Temari"
		};
				
		String[] listBoys = new String[] {
			"Shikamaru", "Naruto", "Sasuke", "Gaara"
		};
		// 2D
		String[][] listPersonage = new String[][] {
			listGirls, listBoys
		};
		// 3D
		String[][][] animeNaruto = new String[][][] {
			listPersonage
		};
		// 4D
//		String[][][][] animes = new String[][][][] {
//			animeNaruto
//		};
		
		System.out.println("Personagens do Anime Naruto:\n");
		for(int i = 0; i < animeNaruto.length; i++) {
			String[][] loopOne = animeNaruto[i];
			
			for(int j = 0; j < loopOne.length; j++) {
				String[] loopTwo = loopOne[j];
				
				Boolean verifyGender = j == 0;
				
				if(verifyGender) {
					System.out.println("Personagens Femininos:\n");
				} else {
					System.out.println("\nPersonagens Masculinos:\n");
				}
				
				for(int y = 0; y < loopTwo.length; y++) {
					System.out.println((y + 1) + " - " + animeNaruto[i][j][y]);
				}
			}
		}
	}

}
