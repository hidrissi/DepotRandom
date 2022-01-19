package random;

import java.util.ArrayList;
import java.util.Random;

public class randomTab {

	static ArrayList<Integer> res = new ArrayList<Integer>();
	
	public static void randomTable() {
		
		int i =0;
		while(i<1000000) {
			Random rand = new Random();
			res.add(rand.nextInt());
			
			i++;
		}
	}
	
	public static int SommeTab() {
		int somme =0;
		for(int i =0; i<res.size(); i++) {
			somme =  somme + res.get(i);
		}
		
		return somme;
	}
		
public static void afficherTable() {
	    System.out.println("Contenu Tableau ");
		for(int i =0; i<res.size(); i++) {
			System.out.println(res.get(i));
		}
		
		 System.out.println("Fin du Tableau \n");

	}

public static void afficherTab() {
    System.out.println("Contenu Tableau ");
	for(int i =0; i<res.size(); i++) {
		System.out.println(res.get(i));
	}
}

}
