package harjoittelu;

public class DVDTuote extends Tuote {
	private int kesto;
	private String ikasuositus;
	
public DVDTuote(int tuotekoodi, String nimi, double tuote, int kesto, String ikasuositus) {
	super(tuotekoodi, nimi, tuote);
	this.kesto = kesto;
	this.ikasuositus = ikasuositus;
}
public int getKesto() {
    return kesto;
}

public void setKesto(int kesto) {
    this.kesto = kesto;
}
public String getIkasuositus() {
    return ikasuositus;
}

public void setTuntipalkka(String ikasuositus) {
    this.ikasuositus = ikasuositus;
}

public String toString() {
    return super.toString() + "\nKesto(min): " + kesto + "\nIkäsuositus: " + ikasuositus;
}


}
