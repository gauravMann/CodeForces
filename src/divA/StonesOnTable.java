package divA;

import java.util.Scanner;

public class StonesOnTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String ballColors = scn.next();
		int count = 0;
		for (int i = 1; i < ballColors.length(); i++) {
			if (ballColors.charAt(i - 1) == ballColors.charAt(i)) {
				count++;
			}
		}
		scn.close();
		System.out.print(count);

	}

}
