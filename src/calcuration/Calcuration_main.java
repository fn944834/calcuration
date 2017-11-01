package calcuration;

import java.util.Scanner;

public class Calcuration_main {

	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
	    System.out.print("Input Number m > ");
		int m = Integer.parseInt(scan.next());

		System.out.print("Input Number n > ");
		int n = Integer.parseInt(scan.next());
		
		Calcuration_lib clib = new Calcuration_lib(m, n);
		System.out.println(" m + n = " +clib.getPlus());
		System.out.println(" m - n = " +clib.getMinus());
		System.out.println(" m * n = " +clib.getTime());
		System.out.println(" m / n = " +clib.getDivide());
		System.out.println(" m % n = " +clib.getMod());

	}

}
