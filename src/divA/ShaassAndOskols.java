package divA;

import java.util.Scanner;

public class ShaassAndOskols {

	public static void solve(int[] arr, int birdsKilled, Scanner scn) {

		for (int i = 0; i < birdsKilled; i++) {

			int line = scn.nextInt();
			int kill = scn.nextInt();
			int up = 0;
			int down = 0;
			// to match array indices
			line = line - 1;
			up = kill - 1;
			down = arr[line] - kill;
			arr[line] = 0;

			if (line - 1 >= 0)
				arr[line - 1] += up;

			if (line + 1 <= arr.length - 1)
				arr[line + 1] += down;

		}
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int birdsKilled = scn.nextInt();
		solve(arr, birdsKilled, scn);

	}

}
