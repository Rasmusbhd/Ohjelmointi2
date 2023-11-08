package media;

public class KirjaOhjelma {

	public static void main(String[] args) {
		Kirja k1 = new Kirja();
		Kirja k2 = new Kirja("90-2010-23432", "Javaa tällä hetkellä", 2020);
		
		k1.setIsbn("88-2333-45644");
		k1.setNimi("Datahallinta");
		boolean onkoJulkaisuVuosiOK = k1.setJulkaisuVuosi(2023);
		
		System.out.println("Oliko annettu julkaisuvuosi ok: " + onkoJulkaisuVuosiOK);
		
		onkoJulkaisuVuosiOK = k1.setJulkaisuVuosi(-45);
		System.out.println("Oliko annettu julkaisuvuosi ok: " + onkoJulkaisuVuosiOK);
		
		System.out.println(k1.toString());
		System.out.println(k2.toString());
	}

}
