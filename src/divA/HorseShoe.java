package divA;

import java.util.Arrays;
import java.util.Scanner;

public class HorseShoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] hscolor = new int[4];
		int count = 1;
		for (int i = 0; i < hscolor.length; i++) {
			hscolor[i] = scn.nextInt();
		}
		Arrays.sort(hscolor);
		for (int i = 0; i < hscolor.length - 1; i++) {
			if (hscolor[i] != hscolor[i + 1]) {
				count++;
			}
		}
		System.out.println(4 - count);

		scn.close();

	}

}
