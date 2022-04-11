package co.edu.variable;

import java.util.Scanner;

public class Orange {
	public static void main(String[] args) {
		// 오렌지 127개 -> 10개씩 담는다 & 5개씩 담는다
		
		Scanner scn = new Scanner(System.in);
		System.out.println("오렌지 개수");
		
		int orange = scn.nextInt();
		
		int boxCount = orange/10;
		int boxCount5 = boxCount%5;
		
		System.out.println("10개씩 담을 수 있는 상자는" + boxCount);
		System.out.println("남는 개수" + boxCount5 );
		
		if(boxCount5 > 5) {
			System.out.println("5개씩 담을 수 있는 상자" + (boxCount5/5+1));
		}else if(boxCount5 <=5) {
			int box5Count = (int)Math.ceil(boxCount5/5.0);
			System.out.println("5개씩 담을 수 있는 상자" + box5Count);
		}
		
	}

}
