package no.hvl.dat100.lab5.tabeller;

import no.hvl.annotations.DescriptionReference;
import no.hvl.annotations.Exercise;
import no.hvl.annotations.TransformOption;

public class Tabeller {

	// a)
	@Exercise(id = {1,1}, transformOption = TransformOption.REPLACE_BODY)
	public static void skrivUt(int[] tabell) {

		// TODO
		System.out.print("[");

		for (int tall : tabell) {

			System.out.print(tall + " ");
		}

		System.out.println("]");
	}
	
	// b)
	@Exercise(id = {1,2}, transformOption = TransformOption.REPLACE_BODY)
	public static String tilStreng(int[] tabell) {
		
		// TODO
		String str = "[";

		for (int i = 0; i < tabell.length; i++) {

			str = str + tabell[i];

			// sett kun komma om der er fler element igjen
			if (i < tabell.length - 1) {
				str = str + ",";
			}

		}

		str = str + "]";

		return str;
	}

	// c)
	@Exercise(id = {1,3}, transformOption = TransformOption.REPLACE_BODY)
	public static int summer(@DescriptionReference(exercises = {1}) int[] tabell) {

		// TODO
		int sum = 0;

		for (int tall : tabell) {
			sum = sum + tall;
		}

		return sum;
	}

	// d)
	@Exercise(id = {1,4}, transformOption = TransformOption.REPLACE_BODY)
	public static boolean finnesTall(@DescriptionReference(exercises = {1}) int[] tabell,
			@DescriptionReference(exercises = {1}) int tall) {

		// TODO
		boolean funnet = false;
		int i = 0;

		while (i < tabell.length && (!funnet)) {

			if (tabell[i] == tall) {
				funnet = true;

			}

			i++;
		}

		return funnet;

	}

	// e)
	@Exercise(id = {1,5}, transformOption = TransformOption.REPLACE_BODY)
	public static int posisjonTall(@DescriptionReference(exercises = {1})int[] tabell, @DescriptionReference(exercises = {1})int tall) {

		// TODO
		int posisjon = -1;
		int i = 0;

		while (i < tabell.length && (posisjon == -1)) {

			if (tabell[i] == tall) {
				posisjon = i;

			}

			i++;
		}

		return posisjon;

	}

	// f)
	@Exercise(id = {1,6}, transformOption = TransformOption.REPLACE_BODY)
	public static int[] reverser(@DescriptionReference(exercises = {1})int[] tabell) {

		// TODO
		int lengde = tabell.length;
		int[] nytabell = new int[lengde];

		for (int i = 0; i < lengde; i++) {
			nytabell[i] = tabell[lengde-1-i];
		}

		return nytabell;
	}

	// g)
	@Exercise(id = {1,7}, transformOption = TransformOption.REPLACE_BODY)
	public static boolean erSortert(int[] tabell) {

		// TODO
		int lengde = tabell.length;
		boolean sortert = true;

		int i = 0;
		while ((i < lengde - 1) && sortert) {

			if (!(tabell[i] <= tabell[i + 1])) {
				sortert = false;
			}
			i++;
		}

		return sortert;
	}

	// h)
	@Exercise(id = {1,8}, transformOption = TransformOption.REPLACE_BODY)
	public static int[] settSammen(@DescriptionReference(exercises = {1})int[] tabell1, @DescriptionReference(exercises = {1})int[] tabell2) {

		// TODO
		int lengde1 = tabell1.length;
		int lengde2 = tabell2.length;

		int[] nytabell = new int[lengde1 + lengde2];

		for (int i = 0; i < lengde1; i++) {
			nytabell[i] = tabell1[i];
		}

		for (int i = 0; i < lengde2; i++) {
			nytabell[lengde1 + i] = tabell2[i];
		}

		return nytabell;

	}
}
