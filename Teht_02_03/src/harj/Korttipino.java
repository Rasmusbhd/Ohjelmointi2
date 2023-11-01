package harj;

public interface Korttipino {
	void lisaa(Pelikortti kortti);
	Pelikortti poista();
	int annaKoko();
	Pelikortti anna(int index);
}
