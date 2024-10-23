package ex2;

public class Plante {
	protected String nom;
	protected double hauteur;
	protected int age;
	protected double prix;
	public Plante(String nom, double hauteur, int age, double prix) {
		super();
		this.nom = nom;
		this.hauteur = hauteur;
		this.age = age;
		this.prix = prix;
	}
	public String toString() {
		return "Nom :" + nom + ", hauteur :" + hauteur + "cm , Âge :" + age + ", prix=" + prix + "dinars ";
	}
	public void description()
	{
		System.out.println(this.toString());
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getHauteur() {
		return hauteur;
	}
	public void setHauteur(float hauteur) {
		this.hauteur = hauteur;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
}