package divA;

import java.util.Scanner;

public class NightAtMuesuem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		String s = scn.next();

		int clockWise = 0;
		int antiWise = 0;
		int rotations = 0;
		int curr = 1;
		int dest = 0;
		for (int i = 0; i < s.length(); i++) {
			dest = (int) (s.charAt(i) - 'a' + 1);
			if (dest > curr) {
				clockWise = dest - curr;
			} else {
				clockWise = 26 + dest - curr;
			}
			antiWise = 26 - clockWise;
			if (clockWise < antiWise) {
				rotations += clockWise;
			} else {
				rotations += antiWise;
			}
			curr = dest;
		}
		scn.close();
		System.out.println(rotations);

	}

}
