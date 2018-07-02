package divA;

import java.util.Scanner;

public class NextRound {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= arr[k - 1] && arr[i] > 0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
