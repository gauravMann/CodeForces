package divA;

import java.util.Scanner;

public class BitPlus {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = 0;
		for (int i = 1; i <= n; i++) {
			String s = scn.next();
			if (s.charAt(1) == '+') {
				x++;
			} else if (s.charAt(1) == '-') {
				x--;
			}
		}
		System.out.println(x);

	}

}
