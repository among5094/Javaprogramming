package ex3_12;

import java.util.Scanner;//스캐너 쓰기 위해

public class DivideByZero {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
		
		int dividend;// 나뉨수
		int divisor; //나눗수

		
		System.out.print("나뉨수를 입력하시오: ");
		dividend = scanner.nextInt(); //나뉨수 입력
		
		System.out.print("나눗수를 입력하시오: ");
		divisor = scanner.nextInt(); //나눗수 입력
				
		System.out.println(dividend+"를"+divisor+"로 나누면 몫은"+dividend/divisor+"입니다.");		
		
		scanner.close();


	}
	
	

}
