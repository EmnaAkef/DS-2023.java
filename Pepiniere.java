package ex2;

public class Pepiniere {
	private Plante[] inventaire;
	public final int MAX_PLANTES=1000;
	private int nombreDePlantes=0;
	public Pepiniere() {
		super();
		this.inventaire = new Plante[MAX_PLANTES];
		this.nombreDePlantes = 0;
	}
	public void ajoutPlante(Plante p)
	{
		if (this.nombreDePlantes+1>1000)
			System.out.println("La pépinière est pleine");
		else
		{
			this.inventaire[this.nombreDePlantes]=p;
			this.nombreDePlantes++;
		}
	}
	public void afficherInventaire()
	{
		System.out.println("Inventaire de la pépinère");
		for(int i=0;i<this.nombreDePlantes;i++)
		{
			System.out.println("Plante #"+(i+1));
			this.inventaire[i].description();
		}
	}
	public double totalAbsorptionTotaleCO2()
	{
		double tot=0;
		for(int i=0;i<this.nombreDePlantes;i++)
		{
			if (this.inventaire[i].getClass().getSimpleName().equals("Arbre"))
				tot += ((Arbre) inventaire[i]).absorptionCO2();
		}
		return tot;
	}
	public int compterArbresCaduques()
	{
		int n=0;
		for(int i=0;i<this.nombreDePlantes;i++)
		{
			if (this.inventaire[i].getClass().getSimpleName().equals("Arbre"))
			{
				if (((Arbre) inventaire[i]).estCaduque()) {
                    n++;
                }
			}
				
		}
		return n;
	}
	public static void main(String[] args) {
		System.out.println("           Pépinière GREEN HANDS");
		Pepiniere pépinière= new Pepiniere();
        Fleur rose = new Fleur(null, 30, 12, 15.99, "Rouge", 2);
        Fleur tulipe = new Fleur("Tulipe", 20, 8, 12.99, "Jaune", 4);
        Arbre chêne = new Arbre("Chêne", 200, 60, 89.99, "Caduque");
        Arbre sapin = new Arbre("Sapin", 150, 30, 59.99, "Persistant");
        rose.setNom("Rose");
        System.out.println("la "+rose.getNom()+" a le couleur "+rose.getCouleur());
        pépinière.ajoutPlante(rose);
        pépinière.ajoutPlante(tulipe);
        pépinière.ajoutPlante(chêne);
        pépinière.ajoutPlante(sapin);
        pépinière.afficherInventaire();
        System.out.println("Total Aborption CO2        "+   pépinière.totalAbsorptionTotaleCO2());
        System.out.println("Nombre d'arbres Caduques dans la pépinière : " + pépinière.compterArbresCaduques());

	}

}
