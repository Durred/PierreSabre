package histoire;

import Personnages.Commercants;
import Personnages.Ronin;
import Personnages.Yakuza;
import Personnages.Samourai;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercants marco = new Commercants("Marco", 20);
		Commercants chonin = new Commercants("Chonin", 40);
		Commercants kumi = new Commercants("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", 30, "whisky", "Warsong");
		Ronin roro = new Ronin("Roro", 60, "shochu");
		
		Samourai akimoto = new Samourai("Miyamoto", 80, "saké", "Akimoto");
		
		akimoto.faireConnaissance(marco);
		akimoto.listerConnaissance();
	}
}
