package divA;

import java.util.Scanner;

public class BeautifulMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int ans = 0;
		int x = 0;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				x = scn.nextInt();
				if (x == 1) {
					ans = Math.abs(i - 3) + Math.abs(j - 3);
					i = 6;
					break;
				}
			}
		}
		scn.close();

		System.out.println(ans);

	}

}
