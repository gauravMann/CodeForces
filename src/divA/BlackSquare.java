package divA;

import java.util.Scanner;

public class BlackSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int[] calories = new int[5];
		int total = 0;

		for (int i = 1; i < calories.length; i++) {
			calories[i] = scn.nextInt();
		}

		String game = scn.next();
		for (int i = 0; i < game.length(); i++) {
			int index = game.charAt(i) - '0';
			total += calories[index];
		}
		System.out.println(total);
		scn.close();

	}

}
