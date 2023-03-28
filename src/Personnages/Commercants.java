package Personnages;

public class Commercants extends Humain {

	public Commercants(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtorquer()
	{
		int perte = getArgent();
		this.perdreArgent(perte);
		System.out.println(parler() + " J'ai tout perdu! Le monde est trop injuste...");
		
		return perte;
	}
	
	public void recevoir(int argent)
	{
		this.gagnerArgent(argent);
		System.out.println(parler() + " " + argent + " berries ! Je te remercie généreux donateur !");
	}
}
