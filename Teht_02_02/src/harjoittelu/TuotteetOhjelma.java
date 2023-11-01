package harjoittelu;

import java.util.Scanner;

public class TuotteetOhjelma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Syötä kirjatuotteen tiedot!");
        System.out.print("Anna tuotekoodi: ");
        int tuotekoodi1 = input.nextInt();
        input.nextLine();
        System.out.print("Anna nimi: ");
        String nimi1 = input.nextLine();
        System.out.print("Anna hinta: ");
        double hinta1 = input.nextDouble();
        System.out.print("Anna sivumäärä: ");
        int sivumaara = input.nextInt();
        input.nextLine();
        System.out.print("Anna sidosasu: ");
        String sidosasu = input.nextLine();

        KirjaTuote kirjatuote = new KirjaTuote(tuotekoodi1, nimi1, hinta1, sivumaara, sidosasu);

        System.out.println("\nSyötä dvdtuotteen tiedot!");
        System.out.print("Anna tuotekoodi: ");
        int tuotekoodi2 = input.nextInt();
        input.nextLine();
        System.out.print("Anna nimi: ");
        String nimi2 = input.nextLine();
        System.out.print("Anna hinta: ");
        double hinta2 = input.nextDouble();
        System.out.print("Anna kesto(min): ");
        int kesto = input.nextInt();
        input.nextLine();
        System.out.print("Anna ikäsuositus: ");
        String ikasuositus = input.nextLine();

        DVDTuote dvdtuote = new DVDTuote(tuotekoodi2, nimi2, hinta2, kesto, ikasuositus);

        System.out.println("\nKIRJATUOTTEEN TIEDOT:");
        System.out.println(kirjatuote);

        System.out.println("\nDVDTUOTTEEN TIEDOT:");
        System.out.println(dvdtuote);

        input.close();
    }
}
