package pack;

public class Monde {

	public static void main(String[] args) {
		Personne Test1=new Personne ("Marcel","Poupoule",20,"chomeur");
		Personne Test2=new Personne ("Michel","Poupoule",21,"chomeur");
		System.out.println(Test1.sePresenter());
		System.out.println(Test2.sePresenter());

		Chanteur c= new Chanteur("Laura","Poupoule",24);
		System.out.println(c.sePresenter());
		
		
		
		System.out.println(c.GetEdition());
		c.SetEdition("Patrick");
		System.out.println(c.GetEdition());
		
		Personne p=c;
		System.out.println(((Chanteur)p).GetEdition());
		
	}

}
