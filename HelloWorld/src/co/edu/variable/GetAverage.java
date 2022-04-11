package co.edu.variable;

import java.util.Scanner;  // Ctrl + shift + O

public class GetAverage {
	public static void main(String[] args) {
		// 입력값을 num1, num2, num3
		Scanner scn = new Scanner(System.in);
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		String myName = "홍길동";
		
		
		// 정수 연산 => 정수. 10, 15, 15 => 40/3.0
		double avg = 40/3.0;
		
		// 결과값 : 입력한 세 정수는 10, 15, 15 이고 평균은 13.3333 입니다.
		
		System.out.println("첫번째 정수");
		num1 = scn.nextInt();
		System.out.println("두번째 정수");
		num2 = scn.nextInt();
		System.out.println("세번째 정수");
		num3 = scn.nextInt();
	    avg = (num1 + num2 + num3)/3.0;
	    	
	    System.out.println("평균은" + avg + "입니다");
	    
		System.out.printf("입력한 세 값은 %d, %d, %d 이고 평균은 %3f ", num1, num2, num3, avg);
		// s는 문자열, f는 소수점 d는 상수(정수)
	}
}
