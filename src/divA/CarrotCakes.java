package divA;

import java.util.Scanner;

public class CarrotCakes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int t = scn.nextInt();
		int k = scn.nextInt();
		int d = scn.nextInt();

//		int left = d;
//
//		int right = t * ((int) Math.ceil((double) n / k) - 1);
////		System.out.println("right:" + right);
//		if (left < right) {
//			System.out.println("YES");
//		} else {
//			System.out.println("NO");
//		}
		
		/*
		 * Alternate: simply check if there are any more cakes to be baked at
		 * time = d;
		 * */
		int currt = 0;
		while(currt <= d){
			n -= k;
			currt += t;
		}
		
		if(n > 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}
