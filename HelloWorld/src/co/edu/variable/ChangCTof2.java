package co.edu.variable;

import java.util.Scanner;

public class ChangCTof2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2, num3;
		int sum;
		int maxValue;
		double avg;
		
		
		System.out.println("첫번째 성적 입력");
		num1 = scanner.nextInt();
		System.out.println("두번째 성적 입력");
		num2 = scanner.nextInt();
		System.out.println("세번째 성적 입력");
		num3 = scanner.nextInt();
		sum = num1 + num2 + num3;
		avg = sum / 3.0;
		
		maxValue = 0;
		if(num1 > num2) {
			maxValue = num1;
		} else {
			maxValue = num2;
		}
		if(maxValue < num3) {
			maxValue = num3;
		}
		
		
		System.out.printf("합은 %3d이고 평균은 %.2f이고 최고점은 %3d점입니다.", sum, avg, maxValue);
	}
	}

