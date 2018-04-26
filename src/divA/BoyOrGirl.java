package divA;

import java.util.Scanner;

public class BoyOrGirl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		int[] store = new int[26];
		int countDistinct = 0;

		for (int i = 0; i < s.length(); i++) {
			int index = (int) (s.charAt(i) - 'a');
			if (store[index] == 0) {
				countDistinct++;
			}
			store[index]++;
		}

		if (countDistinct % 2 == 0) {
			System.out.print("CHAT WITH HER!");
		} else {
			System.out.print("IGNORE HIM!");
		}

	}

}
