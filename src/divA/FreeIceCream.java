package divA;

import java.util.Scanner;

public class FreeIceCream {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long tice = scn.nextLong();

		int distress = 0;
		for (int i = 0; i < n; i++) {
			char ch = scn.next().charAt(0);
			int num = scn.nextInt();
			if (ch == '+') {
				tice += num;
			} else {
				if (tice - num >= 0) {
					tice -= num;
				} else {
					distress++;
				}
			}
		}

		System.out.println(tice + " " + distress);
	}

}
