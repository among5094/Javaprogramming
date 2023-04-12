package ex4_4_UsingThis;

public class Circle {
	
	int radius; //필드
	
	//매개 변수가 하나인 생성자
	public Circle(int radius) { 
		this.radius=radius;
		//필드의 radius = 생성자의 매개변수 radius
		
	}//매개변수의 radius는 여기서 종료됨
	
	//일반 메소드
	void set(int radius) {
		this.radius=radius; 
		//필드의 radius = 메소드의 매개변수 radius
	}
	
	public static void main(String[] args)
	{
		Circle ob1 = new Circle(1);//Circle클래스의 객체 레퍼런스(이름)이 ob1이라는 뜻
		Circle ob2 = new Circle(2); 
		Circle ob3 = new Circle(3);
		
		System.out.println("첫 번째 출력( Circle(1)일 때) ");
		System.out.println("ob1.radius의 결과: "+ob1.radius+", ob2.radius의 결과: " + ob2.radius +", ob3.radius의 결과"+ob3.radius);
		
		ob1.set(4);
		ob2.set(5);
		ob3.set(6);
		
		//값을 덮어씌어줌
		System.out.println("두 번째 출력( ob1.set(4)일 때) ");
		System.out.println("ob1.radius의 결과: "+ob1.radius+", ob2.radius의 결과: " + ob2.radius +", ob3.radius의 결과"+ob3.radius);
	
	}//main method 종료
}//class종료
