package divA;

import java.util.Scanner;

public class DieRoll {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int one = scn.nextInt();
		int two = scn.nextInt();

		int numf = Math.max(one, two);
		String[] result = { "1/6", "1/3", "1/2", "2/3", "5/6", "1/1" };

		System.out.println(result[6 - numf]);

	}

}
