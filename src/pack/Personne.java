package pack;

import java.util.Scanner;

public class Personne {
	protected String prenom;
	protected String nom;
	private int age;
	private String profession;
	
	public Personne(){
		this("","",-1,"");
	}
	
	public Personne(String p,String n,int a){
		nom=n;
		prenom=p;
		age=a;
		profession="";	
	}
	public Personne(String p,String n){
		nom=n;
		prenom=p;
		age=-1;
		profession="";
		
	}
	public Personne(String p,String n,int a,String m){
		nom=n;
		prenom=p;
		age=a;
		profession=m;
		
	}
	public String sePresenter() {
		if(this.profession=="") {
			return "Je suis "+this.prenom+" "+this.nom+" j'ai "+this.age+"ans";
		}
		else if(this.profession=="" & this.age==-1) {
			return "Je suis "+this.prenom+" "+this.nom;
		}
		else {
			return "Je suis "+this.prenom+" "+this.nom+" j'ai "+this.age+"ans et je suis "+this.profession;
		}
	}
	public static Personne creerEtuidant(Scanner scanner){
		Personne e = new Personne();
		try{
			boolean sasieOK = false;
			while (!sasieOK) {
				System.out.print("Nom > ");
				String nom = scanner.nextLine();
				System.out.print("Prenom > ");
				String prenom = scanner.nextLine();
				System.out.print("Age > ");
				int age = scanner.nextInt();
				System.out.print("Moyenne > ");
				String profession=scanner.nextLine();
				e.nom = nom;
				e.prenom = prenom;
				e.age = age;
				e.profession=profession;
				sasieOK = true;
			}
		}catch (Exception ex) {
			
		}
		return e;
	}
	public String getNom(){
		return this.nom;
	}
	
	public String getPrenom(){
		return this.prenom;
	}
}
