package pack;

public class Chanteur extends Personne {
	
	private String MaisonEdition;
	
	public Chanteur(String p,String n,int a) {
		super(p,n,a,"chanteur");
		super.sePresenter();
		super.getNom();
		MaisonEdition="";
	}
	public void SetEdition(String me) {
		MaisonEdition=me;
	}
	public String GetEdition() {
		return this.MaisonEdition;
	}
	public String getNom(){
		return this.nom;
	}
	
	public String getPrenom(){
		return this.prenom;
	}
}
