package divA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SnackTower {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int size = n;
		Set<Integer> set = new HashSet<>();

		for (int i = 1; i <= n; i++) {
			int input = scn.nextInt();
			if (input != size) {
				set.add(input);
				System.out.println();
			} else {
				System.out.print(input + " ");
				size--;
				while (set.contains(size)) {
					System.out.print(size + " ");
					size--;
				}
				System.out.println();
			}
		}

	}

}
