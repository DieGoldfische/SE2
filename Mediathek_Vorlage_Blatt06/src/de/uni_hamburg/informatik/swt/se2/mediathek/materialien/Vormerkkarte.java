package de.uni_hamburg.informatik.swt.se2.mediathek.materialien;

import java.util.LinkedList;
import java.util.List;

import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium;

public class Vormerkkarte
{
	private Medium _medium;
	private List<Kunde> _vormerker;
	
	/**KONSTRUKTOR
	 * 
	 * @param kunde
	 * @param medium
	 */
	public Vormerkkarte(Kunde kunde, Medium medium)
	{
		 assert kunde != null : "Vorbedingung verletzt: entleiher != null";
	     assert medium != null : "Vorbedingung verletzt: medium != null";
	     _medium = medium;
	     _vormerker = new LinkedList<Kunde>();
	     _vormerker.add(kunde);
	}
	
	/**Methode für nächsten Vormerker (position 0)
	 * 
	 * @return Kunde Vormerker auf position 0
	 */
	public Kunde gibNaechsterVormerker()
    {
        return _vormerker.get(0);
    }
	
	/**Methode für Medium der Vormerkkarte
	 * 
	 * @return Medium Das Medium der Vormerkkarte
	 */
	public Medium gibMedium()
	{
		return _medium;
	}
	
	/**Methode für Anzahl der Vormerker
	 * 
	 * @return Integer Anzahl der Vormerker.
	 */
	public int gibVormerkerAnzahl()
	{
		return _vormerker.size();
	}
	
	/**Methode zum Hinzufügen eines weitern Vormerkers
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
	
	/**Methode zum entfernen eines Vormerkers
	 * 
	 * @param kunde Vormerker der Entfernt werden soll
	 */
	public void entferneVormerker(Kunde kunde)
	{
	    assert kunde != null;
	    
	    _vormerker.remove(kunde);
	    
	}
	
	/**Methode für alle Vormerker in einer List
	 * 
	 * @return List<Kunde> Eine Liste aller Vormerker
	 */
	public List<Kunde> getAlleVormerker()
	{
	    return _vormerker;
	}
	
	
	
}
