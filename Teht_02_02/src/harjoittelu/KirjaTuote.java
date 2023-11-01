package harjoittelu;

public class KirjaTuote extends Tuote {
	private int sivumaara;
	private String sidosasu;
	
	public KirjaTuote(int tuotekoodi, String nimi, double tuote, int sivumaara, String sidosasu) {
		super(tuotekoodi, nimi, tuote);
		this.sivumaara = sivumaara;
		this.sidosasu = sidosasu;
}
    public int getSivumaara() {
        return sivumaara;
    }

    public void setSivumaara(int sivumaara) {
        this.sivumaara = sivumaara;
    }
    public String getSidosasu() {
        return sidosasu;
    }

    public void setSidosasu(String sidosasu) {
        this.sidosasu = sidosasu;
    }
    

    public String toString() {
        return super.toString() + "\nSivumaara: " + sivumaara + "\nSidosasu: " + sidosasu;
    }
}


