package divA;

import java.util.Scanner;

public class NewPassWord {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int distinct = 0;
		for (int i = 1; i <= n;) {
			while (distinct < k && i <= n) {
				char ch = (char) ((char) distinct + 'a');
				System.out.print(ch);
				i++;
				distinct++;
			}
			distinct = 0;
		}
	}

}
