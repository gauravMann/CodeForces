package divA;

import java.util.Scanner;

public class SerejaAndDima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		boolean serjaTurn = true;
		int serjaScore = 0;
		int dimaScore = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			if (arr[left] >= arr[right]) {
				if (serjaTurn) {
					serjaScore += arr[left];
				} else {
					dimaScore += arr[left];
				}
				left++;
			} else {
				if (serjaTurn) {
					serjaScore += arr[right];
				} else {
					dimaScore += arr[right];
				}
				right--;

			}
			serjaTurn = !(serjaTurn);
		}
		System.out.print(serjaScore + " " + dimaScore);

	}

}
