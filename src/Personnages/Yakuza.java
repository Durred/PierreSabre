package Personnages;

public class Yakuza extends Humain {
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

	public void gagnerReputation(int reputation) {
		this.setReputation(this.getReputation() + reputation);
	}

	public int perdre() {
		int res = this.getArgent();
		this.setArgent(0);

		gagnerReputation(-1);

		System.out.println(parler() + " J’ai perdu mon duel et mes " + res
				+ " berries, snif... J'ai déshonoré le clan de " + this.getClan() + ".");

		return res;
	}

	public void gagner(int gain) {
		gagnerReputation(1);

		this.gagnerArgent(gain);
		System.out.println(parler() + " Ce ronin pensait vraiment battre " + this.getNom() + " du clan "
				+ this.getClan() + " ? Je l'ai dépouillé de ses " + gain + " berries.");
	}

	public void extorquer(Commercants victime) {
		System.out.println(parler() + " Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		System.out.println(parler() + " " + victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		gagnerReputation(1);
		System.out.println(parler() + " J'ai piqué les " + gain + " berries de " + victime.getNom()
				+ ", ce qui me fait " + this.getArgent() + " berries dans ma poche. Hi ! Hi !");
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		System.out.println(parler() + " Mon clan est celui de " + clan);
	}
}
