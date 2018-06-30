package divA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Presents {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 1; i <= n; i++) {
			int key = scn.nextInt();
			map.putIfAbsent(key, i);
		}
		
		for (int i = 1; i <= n; i++) {
			System.out.print(map.get(i) + " ");
		}
	}

}
