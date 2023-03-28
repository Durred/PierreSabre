package Personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation;

	public Yakuza(String nom, int argent, String favoriteDrink, String clan) {
		super(nom, argent, favoriteDrink);
		this.clan = clan;
		this.reputation = 0;
	}
	
	
	public int getReputation() {
		return reputation;
	}



	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	

	public String getClan() {
		return clan;
	}



	public void setClan(String clan) {
		this.clan = clan;
	}


	public void gagnerReputation(int reputation)
	{
		this.setReputation(this.getReputation() + reputation);
	}
	
	public void extorquer(Commercants victime)
	{
		System.out.println(parler() + " Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		System.out.println(parler() + " " + victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		gagnerReputation(1);
		System.out.println(parler() + " J'ai piqué les " + gain + " berries de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + " berries dans ma poche. Hi ! Hi !");
	}
}
