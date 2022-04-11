package co.edu.variable;

public class OperatorExample {
	public static void main(String[] args) {
		// 나머지 : %
		// 6/4 => 몫 : 1,  나머지 : 2
		int result = 6 / 4;
		int result2 = 6 % 4;
		int val = 5;
		if(val % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		// 75300 원.
		// 이 금액을 5만원짜리로 => ?개,  1만원짜리로 => ?개, 5천원짜리로 => ?개
		// 천원짜리 => ?개, 5백원 => ?개, 1백원 => ?개
		
		//75300원 5만원 1개, 1만원 2개, 5천원 1개, 1백원 3개. 이렇게 계산해서 출력해보시오
		
		int money = 75300;
		
		
		int m1 = (money/50000); //1개
		int m11 = (money%50000); //25300원
		
		
		int m2 = (m11/10000); // 2장 
		int m22 = (m11%10000); // 5300원 
		
		int m3 = (m22/5000); //1장
		int m33 = (m22%5000); //300원
		int m4 = (m33/100); //3장
		System.out.println("금액 : " + money );
		System.out.printf("5만원" + m1, "만원" + m2, "5천원" + m3, "백원" + m4 );
	}
}
