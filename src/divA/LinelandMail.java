package divA;

import java.util.Scanner;

public class LinelandMail {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int endIndex = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print(arr[i + 1] - arr[i] + " ");
				System.out.println(arr[endIndex] - arr[0]);
			} else if (i == endIndex) {
				System.out.print(arr[i] - arr[i - 1] + " ");
				System.out.println(arr[endIndex] - arr[0]);
			} else {
				System.out.print(Math.min(arr[i + 1] - arr[i], arr[i] - arr[i - 1]) + " ");
				System.out.println(Math.max(arr[i] - arr[0], arr[endIndex] - arr[i]));
			}
		}

	}

}
