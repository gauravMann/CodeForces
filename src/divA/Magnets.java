package divA;

import java.util.Scanner;

public class Magnets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int prev = scn.nextInt();
		int groupCount = 1;

		for (int i = 2; i <= n; i++) {
			int x = scn.nextInt();
			if (x != prev) {
				groupCount++;
			}
			prev = x;
		}
		scn.close();

		System.out.print(groupCount);

	}

}
