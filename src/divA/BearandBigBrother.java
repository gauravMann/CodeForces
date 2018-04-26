package divA;

import java.util.Scanner;

public class BearandBigBrother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int count = 0;
		while (a <= b) {
			a = 3 * a;
			b = 2 * b;
			count++;
		}
		System.out.print(count);

	}

}
