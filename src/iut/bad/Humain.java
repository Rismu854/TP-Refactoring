package iut.bad;

public class Humain implements Consommation {
	protected String nom;
	protected String prenom;
	protected int age;
	
	public Humain(String nom,String prenom,int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
	}
	
	public void details() {
		System.out.println(this.toString());
	}
	@Override
	public void manger() {
		System.out.println("je mange");
	}
	
	@Override
	public void boire() {
		System.out.println("je bois");
	}
	
}
