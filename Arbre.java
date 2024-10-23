package ex2;

public class Arbre extends Plante {

	private String type_Feuillage;
	public final int AbsorMoyenne=22;
	
	public Arbre(String nom,double hauteur, int age, double prix,String type_Feuillage) {
		super(nom,hauteur,age,prix);
		this.type_Feuillage = type_Feuillage;
	}
	public String toString() {
		return "type de feuillage :" + type_Feuillage ;
	}
	public void description()
	{
		//super.description();
		System.out.println(super.toString()+this.toString());
	}
	public double absorptionCO2()
	{
		if (this.hauteur>5000)
			return this.AbsorMoyenne+3;
		else
			return this.AbsorMoyenne;
	}
	public boolean estCaduque() {
        return type_Feuillage.equals("Caduque");
    }
}
