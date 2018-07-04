package divA;

import java.util.Arrays;
import java.util.Scanner;

public class Twin {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		int totalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
			totalSum += arr[i];
		}
		Arrays.sort(arr);
		int count = 0;
		int sumSet = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (sumSet * 2 > totalSum) {
				break;
			}
			sumSet += arr[i];
			count++;
		}
		System.out.println(count);
	}

}
