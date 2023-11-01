package henkilot;
import java.util.Scanner;

public class TyontekijaOhjelma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Syötä työntekijän tiedot!");
        System.out.print("Anna nimi: ");
        String nimi = sc.nextLine();
        System.out.print("Anna osoite: ");
        String osoite = sc.nextLine();
        System.out.print("Anna tuntipalkka: ");
        double tuntipalkka = sc.nextDouble();

        Tyontekija tyontekija = new Tyontekija(nimi, osoite, tuntipalkka);

        System.out.println("\nTYÖNTEKIJÄTIEDOT");
        System.out.println(tyontekija);
    }
}
