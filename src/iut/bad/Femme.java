package iut.bad;

public class Femme extends Humain {
	public Femme(String nom,String prenom,int age) {
		super(nom ,prenom, age);
	}
	
	public static void main(String[] args) {
		Homme jean = new Homme("Dupont", "Jean", 28);
		Femme marie = new Femme("Martin", "Marie", 28);
		
		jean.ami(marie);
		marie.ami(jean);
		
		jean.details();
		marie.details();
	}
}
