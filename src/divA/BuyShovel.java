package divA;

import java.util.Scanner;

public class BuyShovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int price = scn.nextInt();
		int r = scn.nextInt();
		
		if( ( (price % 10) == 0) || ( (price - r) % 10 == 0) ||  (price == r ) ){
			System.out.println(1);
		} else{
			for(int i = 2; i <= 10; i++){
				if( ( ((price * i) % 10) == 0 ) || ( ((price * i) - r) % 10 == 0 ) ){
					System.out.println(i);
					break;
				}
			}
		}
		scn.close();

	}

}
