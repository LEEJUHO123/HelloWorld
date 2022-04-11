package co.edu.variable;

public class VarExample4 {
	public static void main(String[] args) {
		// 영어 80, 수학 70, 영어 > 수학 큰지 여부
		
		int eng = 80;
		int math = 70;
		boolean isTrue = true;
		isTrue = false;
		isTrue = eng > math;
		
		if (eng > math) {
			System.out.println(eng +"가" + math + "보다 큽니다.");
		}
	}
}
