package Personnages;

public class Ronin extends Humain {
	private int honneur;

	public Ronin(String nom, int argent, String favoriteDrink) {
		super(nom, argent, favoriteDrink);
		this.honneur = 1;
	}
	
	public void donner(Commercants beneficiaire)
	{
		System.out.println(parler() + " " + beneficiaire.getNom() + " prend ces " + this.getArgent()/10 + " berries.");
		beneficiaire.recevoir(this.getArgent()/10);
	}
}
