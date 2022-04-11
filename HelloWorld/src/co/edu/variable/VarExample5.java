package co.edu.variable;

public class VarExample5 {
	public static void main(String[] args) {
		int val = 10; // 4 * 1byte => 1byte = 8 * bit; on/off
	
		System.out.println(Short.MAX_VALUE);
	
	long val2 = 2147483648L;
	long val3 = 10L; // 10-> long 변환(promotion:자동형변화). 인트형을 롱으로 변환.
	
	int val4 =  (int) 2147483648L; // long -> int (casting : 강제형변화).
	
	int result = (int) (100000000000000L / 5);   //두개의 타입이 같아야 나누기 가능.  5 -> 롱으로 바꿔야함 or 100L -> 작은 값으로
	long val5 = 1000000000L;
	long val6 = 10L;
	
	result = (int) (val5 - val6); //casting(강제형변환).
	System.out.println(result);
	
	char charLit = 97; // 0 ~ 65535 까지의 정수값에 
	charLit = 44032;
	
	System.out.println(charLit);
	
	}
}