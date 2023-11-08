package media;

public class Kirja {
	private String isbn;
	private String nimi;
	private int julkaisuVuosi;
	

	public Kirja() {
		
	}
	public Kirja(String isbn, String nimi, int julkaisuVuosi) {
		this.isbn = isbn;
		this.nimi = nimi;
		this.julkaisuVuosi = julkaisuVuosi;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public int getJulkaisuVuosi() {
		return julkaisuVuosi;
	}
	public boolean setJulkaisuVuosi(int julkaisuVuosi) {
		if (julkaisuVuosi < 0) {
			return false;
		} else {
			this.julkaisuVuosi = julkaisuVuosi;
			return true;
		}
		
	}
	@Override
	public String toString() {
		return "Kirja [isbn=" + isbn + ", nimi=" + nimi + ", julkaisuVuosi=" + julkaisuVuosi + "]";
	}
	

}
