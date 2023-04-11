package Personnages;

import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTraitrise;

	public Traitre(String nom, int argent, String favoriteDrink, String seigneur) {
		super(nom, argent, favoriteDrink, seigneur);
		this.niveauTraitrise = 0;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		System.out.println(parler() + " Mais je suis un traître et mon niveau de traîtrise est : "+ niveauTraitrise +". Chut !");
	}

	public void ranconner(Commercants commercant) {
		if(niveauTraitrise < 3) {
			int argentCommercant = commercant.getArgent();
			int argentRanconner = argentCommercant * 2 /10;
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			niveauTraitrise++;
			System.out.println(parler() + " Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + argentRanconner + " berries ou gare à toi ! ");
			System.out.println(commercant.parler() + " Tout de suite grand " + getNom() + ".");
		}
		else {
			System.out.println(parler() + " Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}

	public void faireLeGentil() {
		if(this.nbConnaissance < 1) {
			System.out.println(parler() + " Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		}
		else {
			Random r = new Random();
			int rand = r.nextInt(nbConnaissance - 1) + 1;
			int don = this.getArgent() * 1 /20;
			String nomAmi = memoire[rand].getNom();
			System.out.println(parler()+ " Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi + ".");
			System.out.println(parler() + " Bonjour l'ami ! "+ nomAmi + " Je voudrais vous aider en vous donnant " + don + " berries.");
			memoire[rand].gagnerArgent(don);
			this.perdreArgent(don);
			System.out.println(memoire[rand].parler() + " Merci " + this.getNom() + ". Vous êtes quelqu'un de bien.");
			niveauTraitrise--;
		}
	}
}
