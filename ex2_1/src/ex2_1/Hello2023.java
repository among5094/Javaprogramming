package ex2_1;

//Hello2023이라는 class
public class Hello2023 {
	
	//sum함수 만들기
	public static int sum(int n,int m) { 
		return n+m;		
	}
	
	//main() 메소드에서 실행 시작
	public static void main(String[] args) {
		
		int i=20; //20은 정수 리터럴
		int s;
		char a;
		
		s=sum(i,10); //sum메소드 호출
		a='?'; //?는 문자 리터럴
		System.out.println(a); //문자 ?를 화면에 출력후 줄바꿈
		System.out.println("Hello"); //Hello출력
		System.out.println(s); //정수s값 화면 출력
				
	}
	

}
