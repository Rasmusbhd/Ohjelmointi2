package henkilot;

public class Henkilo {
	private String nimi;
	private String osoite;

public Henkilo(String nimi, String osoite) {
	this.nimi = nimi;
	this.osoite = osoite;
}
public String getNimi() {
	return nimi;
}
public void setNimi(String nimi) {
	this.nimi = nimi;
}
public String getOsoite() {
	return osoite;
}
public void setOsoite(String osoite) {
	this.osoite = osoite;
}
public String toString() {
	return "Nimi: " + nimi + "\nOsoite: " + osoite;
}
}




