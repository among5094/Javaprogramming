package ex4_11;

class Calc{
	
	//static은 함수의 기능을 수행한다고 해도 무방하다. 
	
	//절댓값을 출력
	public static int abs(int a) {
		return (a>0)? a:-a;
	}
	
	//두 수를 비교해 최대값 출력
	public static int max(int a, int b) {
		return (a>0)? a:b;
	}
	
	//두 수를 비교해 최소값 출력
	public static int min(int a, int b) {
		return (a>0)? b:a;
	}
}

public class CalcEx {
	
	//메인 메소드
	//about static... -> 
	public static void main(String[] args){
		
		Calc c=new Calc(); //객체 생성, 기본 생성자, 자동 삽입
		
		System.out.println(Calc.abs(-5)); //객체가 생성되었으니 Calc를 c라고 해도됨.
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
	}

}
