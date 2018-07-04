package divA;

import java.util.Scanner;

public class YoungPhysicist {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int ox = 0;
		int oy = 0;
		int oz = 0;
		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			int x = scn.nextInt();
			int y = scn.nextInt();
			int z = scn.nextInt();
			ox += x;
			oy += y;
			oz += z;
		}

		if ((ox == 0) && (oy == 0) && (oz == 0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
