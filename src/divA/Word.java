package divA;

import java.util.Scanner;

public class Word {

	public static void fixString(String s) {
		int countUpper = 0;
		int countLower = 0;
		char[] arr = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(arr[i])) {
				countUpper++;
			} else {
				countLower++;
			}
		}
		if (countUpper > countLower) {
			System.out.print(s.toUpperCase());
		} else {
			System.out.print(s.toLowerCase());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		scn.close();
		fixString(s);

	}

}
