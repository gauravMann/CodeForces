package divA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Set<Character> set = new HashSet<>();

		int n = scn.nextInt();
		String s = scn.next();
		for (Character ch : s.toCharArray()) {
			set.add(Character.toLowerCase(ch));
		}
		if (set.size() == 26) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
