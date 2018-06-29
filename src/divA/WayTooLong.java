package divA;

import java.util.Scanner;

public class WayTooLong {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int i = 0; i < n; i++) {
			String s = scn.next();
			if (s.length() > 10) {
				int num = s.length() - 2;

				System.out.print(s.charAt(0));
				System.out.print(num);
				System.out.print(s.charAt(s.length() - 1));
				System.out.println();
			} else {
				System.out.println(s);
			}

		}

	}

}
