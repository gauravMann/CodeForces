package divA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonAndLetters {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();

		Set<Character> unique = new HashSet<>();
		
		str = str.replaceAll("[^a-z]", "");
		
		for (Character ch : str.toCharArray()) {
			unique.add(ch);
		}

		System.out.println(unique.size());
	}

}
