package harj;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class KorttipakkaOhjelma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Korttipakka korttipakka = new Korttipakka();

        System.out.println("Luo korttipakka. Anna kortteja, lopeta syöttämällä '-'.");

        while (true) {
            System.out.print("Anna pelikortin maa (- lopettaa): ");
            String maa = lukija.nextLine();

            if (maa.equals("-")) {
                break;
            }

            System.out.print("Anna pelikortin numero: ");
            int numero = Integer.parseInt(lukija.nextLine());

            Pelikortti kortti = new Pelikortti(maa, numero);
            korttipakka.lisaa(kortti);
        }

        System.out.println("\nKorttipakassa on " + korttipakka.annaKoko() + " korttia:");

        for (int i = korttipakka.annaKoko() - 1; i >= 0; i--) {
            Pelikortti kortti = korttipakka.anna(i);
            System.out.println(kortti);
        }
    }
}
