package Personnages;

public class Humain {
	
	private String nom;
	private int argent;
	private String favoriteDrink;
	
	// Constructor
	public Humain(String nom, int argent, String favoriteDrink)
	{
		this.nom = nom;
		this.argent = argent;
		this.favoriteDrink = favoriteDrink;
	}

	// Get & set
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public String getFavoriteDrink() {
		return favoriteDrink;
	}

	public void setFavoriteDrink(String favoriteDrink) {
		this.favoriteDrink = favoriteDrink;
	}

	// End Get & set
	// Methods
	
	public String parler()
	{
		return " (" + nom + ") - ";
	}
	
	public void direBonjour()
	{
		System.out.println(parler() + " Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + favoriteDrink + ".");
	}
	
	public void boire(String boisson)
	{
		System.out.println(parler() + " Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix)
	{
		if(argent >= prix)
		{
			System.out.println(parler() + " J'ai " + argent + " en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " berries");
			perdreArgent(prix);
		}
		else
		{
			System.out.println(parler() + " Je n'ai plus que " + argent + " berries en poche. Je ne peux même pas m'offrir " + bien + " à "+ prix + " berries...");
		}
	}
	
	public void perdreArgent(int perte)
	{
		if(argent >= 0)
		{
			this.setArgent(argent - perte);
		}
	}
	
	public void gagnerArgent(int gain)
	{
		if(argent >= 0)
		{
			this.setArgent(argent + gain);
		}
	}
}
