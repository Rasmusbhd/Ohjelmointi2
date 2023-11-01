package harjo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PostinumerotOhjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija = new Scanner(System.in);
		Map<String, String> postitoimipaikat = new HashMap<String, String>();
		
		while (true) {
			System.out.println("U, Anna Uusi postinumero, postitoimipaikka");
	        System.out.println("H, Hae postinumeroa vastaava postitoimipaikka");
	        System.out.print("Anna valintasi: ");
	        String valinta = lukija.nextLine();
	        
	        if (valinta.equalsIgnoreCase("U")) {
	        	String postinumero = lukija.nextLine();
                System.out.print("Anna postitoimipaikka: ");
                String toimipaikka = lukija.nextLine();
                postitoimipaikat.put(postinumero, toimipaikka);
            } else if (valinta.equalsIgnoreCase("H")) {
                System.out.print("Anna postinumero, jota vastaava postitoimipaikka haetaan: ");
                String haettuPostinumero = lukija.nextLine();
                String toimipaikka = postitoimipaikat.get(haettuPostinumero);
                if (toimipaikka != null) {
                    System.out.println("Löytyi postitoimipaikka: " + toimipaikka);
                } else {
                    System.out.println("Postitoimipaikkaa ei löytynyt antamallesi postinumerolle.");
                }
            } else {
                System.out.println("Virheellinen valinta. Valitse 'U' lisätäksesi postinumeroa tai 'H' hakeaksesi postitoimipaikkaa.");
            }

            System.out.println();
        }
    }
}
	        
