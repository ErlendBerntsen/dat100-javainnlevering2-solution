package no.hvl.dat100.lab6.matriser;

import no.hvl.annotations.DescriptionReference;
import no.hvl.annotations.Exercise;
import no.hvl.annotations.TransformOption;

public class Matriser {

	// a)
	@Exercise(id = {2,1}, transformOption = TransformOption.REPLACE_BODY)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
			}
			System.out.println();
		}
	}

	// b)
	@Exercise(id = {2,2}, transformOption = TransformOption.REPLACE_BODY)
	public static String tilStreng(int[][] matrise) {

		// TODO
		String str = "";
		
		for (int i = 0; i < matrise.length; i++) {
			
			for (int j = 0; j < matrise[i].length; j++) {
				str = str + matrise[i][j] + " ";
			}
			
			str = str + "\n";
		}
		
		return str;
		
	}

	// c)
	@Exercise(id = {2,3}, transformOption = TransformOption.REPLACE_BODY)
	public static int[][] skaler(@DescriptionReference(exercises = {2}) int tall, int[][] matrise) {
		
		// TODO
		int m = matrise.length;
		int n = matrise[0].length;
		
		int[][] nymatrise = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				nymatrise[i][j] = tall * matrise[i][j];

			}
		}
		
		return nymatrise;
	
	}

	// d)
	@Exercise(id = {2,4}, transformOption = TransformOption.REPLACE_BODY)
	public static boolean erLik(@DescriptionReference(exercises = {2}) int[][] a, @DescriptionReference(exercises = {2}) int[][] b) {

		// TODO
		boolean like = true;
		
		int m = a.length;
		int n = b.length;
		
		for (int i = 0; i < m && like; i++) {
			for (int j = 0; j < n && like; j++) {
				if (a[i][j] != b[i][j]) {
					like = false;
				}

			}

		}
		return like;
	}
	
	// e)
	@Exercise(id = {2,5}, transformOption = TransformOption.REPLACE_BODY)
	public static int[][] speile(int[][] matrise) {

		// TODO
		int m = matrise.length;
		int[][] speiletmatrice = new int[m][m];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				speiletmatrice[j][i] = matrise[i][j];
			}
		}

		return speiletmatrice;
	
	}

	// f)
	@Exercise(id = {2,6}, transformOption = TransformOption.REPLACE_BODY)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		int m = a.length;
		int n = b.length;
		
		int l = a[0].length;
		
		int[][] c = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				
				for (int k = 0; k < l; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
	
			}
		}

		return c;
	
	}
}
