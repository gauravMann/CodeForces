package divA;

import java.util.Scanner;

public class OrderNightWatch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
			max = Math.max(arr[i], max);
			min = Math.min(arr[i], min);
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > min && arr[i] < max) {
				count++;
			}
		}
		System.out.println(count);
	}

}
