package divA;

import java.util.Scanner;

public class Games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		/* Row - no of teams, Col - home color, guest color */
		int[][] colors = new int[n][2];
		int count = 0;

		for (int i = 0; i < n; i++) {
			colors[i][0] = scn.nextInt();
			colors[i][1] = scn.nextInt();
		}
		scn.close();

		/*
		 * Outer loops selects i th team and compares it's home color with all
		 * visiting teams, and home colors of all visiting teams with it's guest
		 * color
		 */

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				/* Check if home color of i is same as visiting team */
				if (colors[i][0] == colors[j][1]) {
					count++;
				}
				if (colors[i][1] == colors[j][0]) {
					count++;
				}

			}
		}
		System.out.println(count);

	}

}
