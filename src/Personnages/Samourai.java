package Personnages;

public class Samourai extends Ronin {
	private String seigneur;

	public Samourai(String nom, int argent, String favoriteDrink, String seigneur) {
		super(nom, argent, favoriteDrink);
		this.seigneur = seigneur;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		System.out.println(parler() + " Je suis fier de servir le seigneur " + seigneur);
	}
	
	public void boire(String boisson) {
		System.out.println(parler() + " Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre " + boisson + ".");
	}

}
