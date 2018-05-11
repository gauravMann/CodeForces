package divA;

import java.util.Scanner;

public class AntonandDanik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String s = scn.next();
		int countAnton = 0;
		int countDanik = 0;
		

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'A') {
				countAnton++;
			} else {
				countDanik++;
			}
		}

		if (countAnton == countDanik) {
			System.out.print("Friendship");
		} else if (countAnton > countDanik) {
			System.out.print("Anton");
		} else {
			System.out.print("Danik");
		}
		scn.close();

	}

}
