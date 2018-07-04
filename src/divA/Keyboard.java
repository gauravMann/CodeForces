package divA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Keyboard {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] feeder = { "qwertyuiop", "asdfghjkl;", "zxcvbnm,./" };

		Map<Character, Character> left = new HashMap<>();
		Map<Character, Character> right = new HashMap<>();

		for (int i = 0; i < feeder.length; i++) {
			for (int j = 1; j < feeder[i].length(); j++) {
				char ch = feeder[i].charAt(j);
				char chm1 = feeder[i].charAt(j - 1);
				right.put(ch, chm1);
			}
		}

		for (int i = 0; i < feeder.length; i++) {
			for (int j = 0; j < feeder[i].length() - 1; j++) {
				char ch = feeder[i].charAt(j);
				char chp1 = feeder[i].charAt(j + 1);
				left.put(ch, chp1);
			}
		}
		
		char inp = scn.next().charAt(0);
		String s = scn.next();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (inp == 'R') {
				System.out.print(right.get(ch));
			} else {
				System.out.print(left.get(ch));
			}
		}
		System.out.println();

	}

}
