package ex2_3;

public class CircleArea {
	
	//메인 메소드
	public static void main(String[] args) {
		
		final double PI=3.14; //final -> 상수 선언 키워드
		double r=10.2; //원의 반지름 radius
		double circleArea =r*r*PI; //원의 면적 계산
		
		//원의 면적 화면에 출력하기
		
		System.out.print("반지름: "+r+", ");//여기서 r은 10.2라는 !!문자열!!이 된다
		System.out.println("원의 면적 = "+circleArea );

	}//메인메소드 끝

}//클래스 끝
