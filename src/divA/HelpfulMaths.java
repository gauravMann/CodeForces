package divA;

import java.util.Scanner;

public class HelpfulMaths {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String input = scn.next();
		int length = input.length();

		input = input.replaceAll("[^0-9]", "");
		int[] arr = new int[3];

		for (Character ch : input.toCharArray()) {
			int index = (int) (ch - '0') - 1;
			arr[index]++;
		}

		for (int i = 1; i <= length; i++) {
			if (i % 2 == 0) {
				System.out.print('+');
			} else {
				if (arr[0]-- > 0) {
					System.out.print("1");

				} else if (arr[1]-- > 0) {
					System.out.print("2");
				} else if (arr[2]-- > 0) {
					System.out.print("3");
				} else {
					// nothing
				}

			}

		}
	}
}
