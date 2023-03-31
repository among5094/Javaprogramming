package ex3_13;

import java.util.Scanner; //스캐너 쓰기위한 임포트문

//import java.util.*; //util안에 들어있는거 다 부르기


public class DevideByZeroHandling {
	
	public static void main(String[] args) {
		
		//스캐너 객체 생성
		Scanner rd = new Scanner(System.in); 
		
		int dividend;// 나뉨수
		int divisor; //나눗수
		//String dividend;
		//String divisor;

		try {
			
		System.out.print("나뉨수를 입력하시오: ");
		dividend = rd.nextInt(); //나뉨수 입력
		System.out.print("나눗수를 입력하시오: ");
		divisor = rd.nextInt(); //나눗수 입력
		
		}catch(ArithmeticException e) {
			System.out.println("정수가 아닙니다. 다시 입력하세요!");
		}
		
		try {
			System.out.println(dividend+"를"+divisor+"로 나누면 몫은"+dividend/divisor+"입니다.");
		}
		catch(ArithmeticException e) { //Exception가 있는 객체에 e로 접근하기
			System.out.println("0으로 나눌 수 없습니다.");
		}		
		
		rd.close();


	}
	
	

}
