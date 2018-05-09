package divA;

import java.util.Scanner;

public class PetyaAndStrings {

	public static int lexicographical(String one, String two) {
		String a = one.toLowerCase();
		String b = two.toLowerCase();
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) < b.charAt(i)) {
				return -1;
			} else if (b.charAt(i) < a.charAt(i)) {
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String one = scn.next();
		String two = scn.next();
		scn.close();
		int ans = lexicographical(one, two);
		System.out.print(ans);

	}

}
