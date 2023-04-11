package Personnages;

public class Humain {

	private String nom;
	private int argent;
	private String favoriteDrink;
	protected int nbConnaissance;
	protected Humain[] memoire = new Humain[30];

	// Constructor
	public Humain(String nom, int argent, String favoriteDrink) {
		this.nom = nom;
		this.argent = argent;
		this.favoriteDrink = favoriteDrink;
		this.nbConnaissance = 0;
	}

	// Get & set
	public String getNom() {
		return nom;
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

	protected String parler() {
		return " (" + nom + ") - ";
	}

	public void direBonjour() {
		System.out.println(parler() + " Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + favoriteDrink + ".");
	}

	public void boire() {
		System.out.println(parler() + " Mmmm, un bon verre de " + favoriteDrink + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			System.out.println(parler() + " J'ai " + argent + " en poche. Je vais pouvoir m'offrir " + bien + " à "
					+ prix + " berries");
			perdreArgent(prix);
		} else {
			System.out.println(parler() + " Je n'ai plus que " + argent
					+ " berries en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " berries...");
		}
	}

	protected void perdreArgent(int perte) {
		if (perte >= 0) {
			this.setArgent(argent - perte);
		}
	}

	protected void gagnerArgent(int gain) {
		if (gain >= 0) {
			this.setArgent(argent + gain);
		}
	}

	public void faireConnaissance(Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);
	}

	private void memoriser(Humain humain) {
		memoire[nbConnaissance%3] = humain;
		nbConnaissance++;
	}

	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}

	public void listerConnaissance() {
		String res = "";
		int limite = 0;
		if(nbConnaissance >= 30) {
			limite = 30;
		}
		else {
			limite = nbConnaissance;
		}
		for (int i = 0; i < limite; i++) {
			res = res + "   " + memoire[i].getNom();
		}
		System.out.println(parler() + " Je connais beaucoup de monde dont :" + res);
	}
}
