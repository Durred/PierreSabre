package histoire;

import Personnages.Humain;
import Personnages.Commercants;
import Personnages.Yakuza;

public class HistoireTP4 {
	
	public static void main(String[] args)
	{
		/*Humain Zoro = new Humain("Zoro", 15, "saké");
		
		Zoro.parler();
		Zoro.direBonjour();
		Zoro.acheter("un Super-saké", 8);
		Zoro.boire("Super-saké");
		Zoro.acheter("un Super-saké", 8);
		Zoro.gagnerArgent(7);
		Zoro.acheter("un Super-saké", 7);*/
		
		Commercants Marco = new Commercants("Marco", 20);
		
		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.recevoir(15);
		Marco.boire(Marco.getFavoriteDrink());
		
		Yakuza Yaku = new Yakuza("Yaku Le Noir", 30, "whisky", "Mugiwara");
		
		Yaku.direBonjour();
		Yaku.extorquer(Marco);
	}
	
}