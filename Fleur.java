package ex2;

public class Fleur extends Plante {
	private String couleur;
	private int moisF;
	public Fleur(String nom, double hauteur, int age, double prix, String couleur, int moisF) {
		super(nom, hauteur, age, prix);
		this.couleur = couleur;
		this.moisF = moisF;
	}
	public String toString() {
		super.toString();
		return "couleur :" + couleur ;
	}
	public void description()
	{
		//super.description();
		System.out.println(super.toString()+this.toString());
		this.fleurir();
	}
	public void fleurir()
	{
		if(this.moisF==4 || this.moisF==5 || this.moisF==6)
			System.out.println("La fleur est en fleurs");
		else
			System.out.println("La fleur n'est pas en fleurs");
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
}
