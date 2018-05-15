package de.uni_hamburg.informatik.swt.se2.mediathek.materialien;

import java.util.LinkedList;
import java.util.List;

import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium;

public class Vormerkkarte
{
	private Medium _medium;
	private List<Kunde> _vormerker;
	
	public Vormerkkarte(Kunde kunde, Medium medium)
	{
		 assert kunde != null : "Vorbedingung verletzt: entleiher != null";
	     assert medium != null : "Vorbedingung verletzt: medium != null";
	     _medium = medium;
	     _vormerker = new LinkedList<Kunde>();
	     _vormerker.add(kunde);
	}
	
	public Kunde gibNaechsterVormerker()
    {
        return _vormerker.get(0);
    }
	public Medium gibMedium()
	{
		return _medium;
	}
	
	public int gibVormerkerAnzahl()
	{
		return _vormerker.size();
	}
	
	/**
	 * 
	 * @param kunde der Kunde
	 * @require _vormerker.size < 3
	 * Abfrage ob Vormerkbar muss in Werkzeug erfolgen
	 */
	public void addVormerker(Kunde kunde)
	{
		assert _vormerker.size()<3 : "Keine weiteren Vormerker möglich!";
		if(_vormerker.size()<3)
		{
			_vormerker.add(kunde);
		}
			
	}
}
