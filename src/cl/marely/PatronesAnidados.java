/*
 * PROGRAMA PATRONES ANIDADOS
 * @author MARELY
 * Este programa realiza 4 patrones diferentes ingresando n.
 */

package cl.marely;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PatronesAnidados {

	private static int n = 0;

	/*****************
	 * PATRON 1 * -
	 */

	private static void patron1() {
		int x = n;
		System.out.println("*** PATRON 1 ***\n");
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x; j++) {
				if (i == 1 || i == x || j == 1 || j == x) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	/*****************
	 * PATRON 2 * -
	 */

	private static void patron2() {

		System.out.println("*** PATRON 2 ***\n");
		for (int j = 1; j <= n; j++) {

			for (int i = 1; i <= n; i++) {
				if (j == 1 || j == n || i == n - j + 1) {
					System.out.print("X");
				} else {
					System.out.print("\s");
				}
			}
			System.out.println();
		}
	}

	/*****************
	 * PATRON 3 * -
	 */

	private static void patron3() {

		int x = n;
		System.out.println("*** PATRON 3 ***\n");
		for ( int j = 1; j <= n; j++) {
			for (int i = 1; i <= n; i++) {
				if ((i == x) || (i == j)) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			x--;
		}
	}

	/*****************
	 * PATRON 4 * -
	 */

	private static void patron4() {
		int i = 1;
		int j = 1;
		System.out.println("*** PATRON 4 ***\n");
		for (j = 1; j <= n; j++) {
			for (i = 1; i <= n; i++) {
				if (((i == 1) && (j != 1)) || ((i == n) && (j != n))) {
					System.out.print(" ");
				} else {
					System.out.print("X");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Ingrese n: ");
			n = sc.nextInt();
			sc.close();
			patron1();
			System.out.println(System.lineSeparator());
			patron2();
			System.out.println(System.lineSeparator());
			patron3();
			System.out.println(System.lineSeparator());
			patron4();
		} catch (InputMismatchException ex) {
			System.out.println("error");
		}
		;
	}
}
