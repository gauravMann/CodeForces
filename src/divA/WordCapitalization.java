package divA;

import java.util.Scanner;

public class WordCapitalization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		char[] arr = s.toCharArray();

		if (Character.isUpperCase(arr[0])) {
			System.out.print(s);
		} else {
			arr[0] = Character.toUpperCase(arr[0]);
			s = arr[0] + s.substring(1);
			System.out.println(s);
		}

	}

}
