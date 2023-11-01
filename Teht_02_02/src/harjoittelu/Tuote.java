package harjoittelu;

public class Tuote {
	private int tuotekoodi;
	private String nimi;
	private double hinta;
	
public Tuote(int tuotekoodi, String nimi, double hinta) {
	this.tuotekoodi = tuotekoodi;
	this.nimi = nimi;
	this.hinta = hinta;	
}
public int getTuotekoodi() {
	return tuotekoodi;
}
public void setTuotekoodi(int tuotekoodi) {
	this.tuotekoodi = tuotekoodi;
}
public String getNimi() {
	return nimi;
}
public void setNimi(String nimi) {
	this.nimi = nimi;
}
public double getHinta() {
	return hinta;
}
public void setHinta(double hinta) {
	this.hinta = hinta;
}
public String toString() {
	return "Tuotekoodi: " + tuotekoodi + "\nNimi: " + nimi + "\nHinta: " + hinta;
}

}
