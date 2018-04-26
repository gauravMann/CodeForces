package divA;

import java.util.Scanner;

public class VanyaFence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int height = scn.nextInt();
		int minWidth = 0;

		for (int i = 1; i <= N; i++) {
			int heightFrnd = scn.nextInt();

			if (heightFrnd <= height) {
				minWidth += 1;
			} else {
				minWidth += 2;
			}

		}
		System.out.println(minWidth);

	}

}
