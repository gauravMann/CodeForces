package divA;

import java.util.Scanner;

public class Team {

	public static int stupidSolve(int n) {

		Scanner in = new Scanner(System.in);
		int[][] arr = new int[n][3];

		int count1 = 0;
		int solveCount = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {

				arr[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			count1 = 0;
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == 1) {
					count1++;
				}
			}
			if (count1 >= 2) {
				solveCount++;
			}
		}
		in.close();
		return solveCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			int c = scn.nextInt();
			if (a + b + c >= 2) {
				ans++;
			}
		}
		scn.close();
		System.out.println(ans);

	}

}
