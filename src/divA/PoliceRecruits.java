package divA;

import java.util.Scanner;

public class PoliceRecruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int policeCount = 0;
		int untreatedCount = 0;

		for (int i = 1; i <= n; i++) {
			int input = scn.nextInt();

			if (input < 0) {
				if (policeCount == 0) {
					untreatedCount++;
				} else {
					policeCount--;
				}
			} else {
				policeCount += input;
			}
		}
		System.out.println(untreatedCount);
		scn.close();

	}

}
