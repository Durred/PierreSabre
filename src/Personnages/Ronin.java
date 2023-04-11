package Personnages;

public class Ronin extends Humain {
	private int honneur;

	public Ronin(String nom, int argent, String favoriteDrink) {
		super(nom, argent, favoriteDrink);
		this.honneur = 1;
	}

	public int getHonneur() {
		return honneur;
	}

	public void setHonneur(int honneur) {
		this.honneur = honneur;
	}

	public void donner(Commercants beneficiaire) {
		System.out
				.println(parler() + " " + beneficiaire.getNom() + " prend ces " + this.getArgent() / 10 + " berries.");
		beneficiaire.recevoir(this.getArgent() / 10);
	}

	public void provoquer(Yakuza adversaire) {
		System.out.println(
				parler() + "Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");

		if (this.getHonneur() * 2 >= adversaire.getReputation()) {
			int gain = adversaire.perdre();
			this.setHonneur(getHonneur() + 1);
			this.gagnerArgent(gain);
			System.out.println(parler() + " Je t’ai eu petit yakusa!");
		}

		else {
			int argent = this.getArgent();
			adversaire.gagner(argent);
			this.perdreArgent(argent);
			this.setHonneur(this.getHonneur() - 1);
			System.out
					.println(parler() + " J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
		}

	}
}
