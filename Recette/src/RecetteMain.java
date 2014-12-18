import java.util.Scanner;


public class RecetteMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rep1 , rep2 =0;
		do {
			
			System.out.println("1 * Crée des aliments. \n"+
								"2 * Crée une recette. \n"+
								"3 * Voir les recettes. \n"+
								"4 * Voir les aliments.");
			rep1 = sc.nextInt();
			if(rep1 == 1)
			{	
				String nomIngre;
				int idIngre;
				int caloIngre;
				System.out.println("Quel est le nom de l'ingredient ?");
				nomIngre = sc.next();
				System.out.println("Quel est l'identifiant de l'ingrediant ?");
				idIngre = sc.nextInt();
				System.out.println("Combien de calories contient-il ?");
				caloIngre = sc.nextInt();
				
				if(idIngre !=0){
					System.out.println("Vous avez crée l'aliment : "+nomIngre);
				}
				
				Recette.lesAliments.add(new Aliment(idIngre, nomIngre, caloIngre));
				
			}
			else if (rep1 == 4){
				for (Aliment unAliment : Recette.lesAliments){
					System.out.println(unAliment.toString());					
				}
				 if(rep1 == 2){
					int idMelange;
					String nomMelange;
					int tempsPrepare;
					int tempsCuir;
					int niveauDifficult;
					int idTyp;
					String libelleTyp;
					
					System.out.println("Quel est l'id de la recette ?");
					idMelange = sc.nextInt();
					System.out.println("Quel est le nom de la recette ?");
					nomMelange = sc.next();
					System.out.println("Quel est le temps de préparation de la recette ?");
					tempsPrepare= sc.nextInt();
					System.out.println("Quel est le temps de cuisson ?");
					tempsCuir = sc.nextInt();
					System.out.println("Niveau de difficulté ?");
					niveauDifficult = sc.nextInt();
					
					
					
					
				}
			}
		}
		while (rep2 != 14);
			
		
	}

}
