package divA;

import java.util.Scanner;

public class ColorfulStones {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String str = scn.next();
		String instr = scn.next();

		// 1 based indexing
		int count = 1;
		// string point
		int strP = 0;
		for (int i = 0; i < instr.length(); i++) {
			if (instr.charAt(i) == str.charAt(strP)) {
				count++;
				strP++;
			} else {
				// do nothing
			}
		}
		
		System.out.println(count);

	}

}
