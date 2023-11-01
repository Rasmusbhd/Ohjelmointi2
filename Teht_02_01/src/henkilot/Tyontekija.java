package henkilot;

class Tyontekija extends Henkilo {
    private double tuntipalkka;

    public Tyontekija(String nimi, String osoite, double tuntipalkka) {
        super(nimi, osoite);
        this.tuntipalkka = tuntipalkka;
    }

    public double getTuntipalkka() {
        return tuntipalkka;
    }

    public void setTuntipalkka(double tuntipalkka) {
        this.tuntipalkka = tuntipalkka;
    }

    public String toString() {
        return super.toString() + "\nTuntipalkka: " + tuntipalkka;
    }
}