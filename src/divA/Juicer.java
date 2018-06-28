package divA;

import java.util.Scanner;

public class Juicer {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int nOranges = scn.nextInt();
		int throwS = scn.nextInt();
		int overFlow = scn.nextInt();

		int juice = 0;
		int count = 0;
		
		for (int i = 0; i < nOranges; i++) {
			int or = scn.nextInt();
			if (or <= throwS) {
				juice += or;
				if (juice > overFlow) {
					juice = 0;
					count++;
				}
			}else{
				//do nothing
			}
		}
		
		if (juice > overFlow) {
			juice = 0;
			count++;
		}
		System.out.println(count);

	}

}
