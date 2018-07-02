package divA;

import java.util.Scanner;

public class MLongestUncommonSequence {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String a = scn.next();
		String b = scn.next();
		if (a.equals(b)) {
			System.out.println(-1);
			return;
		} else {
			System.out.println(Math.max(a.length(), b.length()));
		}
	}

}
