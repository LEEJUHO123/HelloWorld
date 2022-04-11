package co.edu.variable;

public class moneymoney {
	public static void main(String[] args) {
		// 현금 10000원, 물건가격 7500원(부가세 750원 포함), 잔돈 2500원
		int cashe = 10000;
		int product = 7500;
		int VAT = (int) (product * 0.1);
		product = product - VAT;
		int changes = cashe - (product + VAT);
		
		System.out.println("현금" + cashe + "원");
		System.out.println("물건가격" + product + "원");
		System.out.println("부가세" + VAT + "원");
		System.out.println("잔돈" + changes + "원");
	}

}
