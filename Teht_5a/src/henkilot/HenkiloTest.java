package henkilot;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HenkiloTest {

	@Test
	void testGetIka() {
		int ikaToTest = 30;
		Henkilo h1 = createHenkiloWithIka(ikaToTest);
		Assert.assertTrue(h1.getIka() == ikaToTest);
	}

	private Henkilo createHenkiloWithIka(int ikaToTest) {
		int currentYear = LocalDate.now().getYear();	
		int syntVuosi = currentYear - ikaToTest;
		String syntPvm = syntVuosi + "-01-01";
		Henkilo h1 = new Henkilo("Matti", syntPvm);
		return h1;
	}

	@Test
	void testIs17YearOldIsNot18OrOlder() {
		Henkilo h1 = createHenkiloWithIka(17);
		Assert.assertFalse(h1.is18orOlder());
		
	}
	
	@Test
	void testIs18YearOldIsNot18OrOlder() {
		Henkilo h1 = createHenkiloWithIka(18);
		Assert.assertTrue(h1.is18orOlder());
	}

	@Test
	void testIs30YearOldIsNot18OrOlder() {
		Henkilo h1 = createHenkiloWithIka(30);
		Assert.assertTrue(h1.is18orOlder());
	}
	
	

}
