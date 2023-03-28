package Personnages;

public class Ronin extends Humain {
	private int honneur;
	private int force;

	public Ronin(String nom, int argent, String favoriteDrink, int force) {
		super(nom, argent, favoriteDrink);
		this.honneur = 1;
	}
	
	public void donner(Commercants beneficiaire)
	{
		System.out.println(parler() + " " + beneficiaire.getNom() + " prend ces " + this.getArgent()/10 + " berries.");
		beneficiaire.recevoir(this.getArgent()/10);
	}
	
	public int perdre()
	{
		//TO-DO PAGE 3 TP4
	}
	
	public void provoquer(Yakuza adversaire)
	{
		
	}
}
