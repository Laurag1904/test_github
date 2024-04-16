package linkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserter {
	
	// private - Sichtbarkeitsbereich auf Klasse beschr�nkt 
	// static - von der Klasse abh�ngig und nicht vom Objekt
	// final - Variable nach Initialisierung unver�ndert 
	private static final Pattern vegetables = Pattern.compile(
			"Zuchini|Paprikas?|Zwiebeln?|Tomaten?|Melanzani");

	
	public static void insertCheeseAroundVegetables(List<String> ingredients) {
		//Initalisierung Laufvariable (iterator)
		//Abruchbedingung(hasNect())
		// keine Inkrementierung -> passiert im Schleifenk�rper
		for(ListIterator<String> iterator = ingredients.listIterator();iterator.hasNext();) {
			String ingredient = iterator.next();
			// matcher -> wird verwendet, um ingredient in unserem Muster zu finden 
			// matches() -> f�r den direkten Vergleich
			if(vegetables.matcher(ingredient).matches()) {
				iterator.add("K�se");
			}
			
		}
	}
	
	public static void main(String[] args) {
		List<String> ingredients = new LinkedList<String>();
		Collections.addAll(ingredients, "Gnocchi", "Paprika", "Tomaten", "Pfeffer", "Melanzani");
		insertCheeseAroundVegetables(ingredients);
		System.out.println(ingredients);
		
	}

}
