package co.edu.variable;

public class VarExample6 {
	
	public static void main(String[] args) {
			String myName = "홍길동"; //참조데이터타입.
			
			int age = 10; // 기본데이터타입.
			double height = 167.4;
			int mathScore, engScore;
			mathScore = 80;
			engScore = 90;
		
			System.out.println(myName + "의 나이는" + age + "이고 키는" + height + "이고" + "영어, 수학점수의 합은" + (mathScore + engScore) + "입니다." );
			 // 처음에 문자열이면 뒤에도 문자열로 처리해버림!! 괄호처리 해야됨!
			
			char firstChar = myName.charAt(0); // 0 =홍길동
			System.out.println((int)firstChar);

		}
}
