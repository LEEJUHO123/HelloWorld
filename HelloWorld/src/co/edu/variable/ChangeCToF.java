package co.edu.variable;

import java.util.Scanner;

public class ChangeCToF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double c;
		int f;
		System.out.println("화씨 온도 : ");
		f = scanner.nextInt();
		
		c = 5/9.0*(f-32); // 정수.
		System.out.printf("화씨온도 %2d는 섭시온도 %.1f", f, c);
	
	//			System.out.println("화씨온도 : ");
	//		int farhrenheit = scanner.nextInt();
	//		
	//		float celcius = (float)5/9 * (farhrenheit-32);
	//		System.out.printf("입력한 화씨온도를 섭씨온도로 변환한 값 : %.2f" , celcius);
	//		scanner.close();
	}
}
