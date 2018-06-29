package divA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TeamOlympiad {
	static int noTeams = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();
		map.put(1, new ArrayList<>());
		map.put(2, new ArrayList<>());
		map.put(3, new ArrayList<>());

		for (int i = 1; i <= n; i++) {
			int mem = scn.nextInt();
			map.get(mem).add(i);
		}

		map.forEach((k, v) -> {
			noTeams = Math.min(noTeams, v.size());
		});

		System.out.println(noTeams);
		while (noTeams-- > 0) {
			System.out.print(map.get(1).remove(0) + " " + map.get(2).remove(0) + " " + map.get(3).remove(0));

			System.out.println();
		}

	}

}
