package de.uni_hamburg.informatik.swt.se2.mediathek.materialien;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.uni_hamburg.informatik.swt.se2.mediathek.fachwerte.Datum;
import de.uni_hamburg.informatik.swt.se2.mediathek.fachwerte.Geldbetrag;
import de.uni_hamburg.informatik.swt.se2.mediathek.fachwerte.Kundennummer;
import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.CD;
import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium;

public class VormerkkarteTest
{

	private Vormerkkarte _karte;
	private Kunde _kunde;
	private Kunde _kunde2;
	private Medium _medium;

	public VormerkkarteTest()
	{
		_kunde = new Kunde(new Kundennummer(123456), "ich", "du");
		_kunde2 = new Kunde(new Kundennummer(123456), "ich2", "du2");

		_medium = new CD("bar", "baz", "foo", 123);
		_karte = new Vormerkkarte(_kunde, _medium);
	}

	// @Test
	// public void testegetFormatiertenString() throws Exception
	// {
	// assertNotNull(_karte.getFormatiertenString());
	// }

	@Test
	public void testeKonstruktor() throws Exception
	{
		assertEquals(_kunde, _karte.gibNaechsterVormerker());
		assertEquals(_medium, _karte.gibMedium());

	}
	
	@Test
	public void testeGibAnzahlVormerker()
	{
		_karte.addVormerker(_kunde2);
		assertEquals(_karte.gibVormerkerAnzahl(), 2);
	}
	
	
	@Test
	public void testeEntferneVormerker()
	{
	    _karte.addVormerker(_kunde2);
	    
	    _karte.entferneVormerker(_kunde2);
	    
	    assertFalse(_karte.getAlleVormerker().contains(_kunde2));
	}


	
//	@Test
//	public void testEquals()
//	{
//		Vormerkkarte karte1 = new Vormerkkarte(_kunde, _medium);
//
//		assertTrue(_karte.equals(karte1));
//		assertEquals(_karte.hashCode(), karte1.hashCode());
//
//		Kunde kunde2 = new Kunde(new Kundennummer(654321), "ich", "du");
//		CD medium2 = new CD("hallo", "welt", "foo", 321);
//		Vormerkkarte karte2 = new Vormerkkarte(kunde2, medium2);
//
//		assertFalse(_karte.equals(karte2));
//		assertNotSame(_karte.hashCode(), karte2.hashCode());
//
//	}
}
