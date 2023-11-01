package harj;

import java.util.ArrayList;
import java.util.List;

class Korttipakka implements Korttipino {
	private List<Pelikortti> kortit;
	
public Korttipakka() {
	kortit = new ArrayList<>();
}
public void lisaa(Pelikortti kortti) {
	kortit.add(kortti);
}
public Pelikortti poista() {
	if (kortit.isEmpty()) {
		return null;
	}
	return kortit.remove(kortit.size()-1);
}
public int annaKoko() {
	return kortit.size();
}
public Pelikortti anna(int index) {
	if (index >= 0 && index < kortit.size()) {
		return kortit.get(index);
	}
	return null;
}
}
