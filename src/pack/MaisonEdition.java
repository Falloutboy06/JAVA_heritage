package pack;

import java.util.ArrayList;
import java.util.Scanner;

public class MaisonEdition {
	
	private String nom;
	private Chanteur[] tab =new Chanteur[10];
	static ArrayList<Chanteur> Chanteur = new ArrayList<Chanteur>();
	
	public MaisonEdition(String n){
		nom=n;
		/*for(int i=0;i<tab.length;i++) {}*/
	}
	public static void supprimerChanteur(ArrayList<Chanteur> etudiants, Chanteur e){
		int index = 0;
		for (Chanteur etudiant : etudiants) {
			if(e.getNom().equalsIgnoreCase(Chanteur.getNom()) && e.getPrenom().equalsIgnoreCase(etudiant.getPrenom())){
				break;
			}
			index++;
		}
		Chanteur.remove(index);
	}

}
