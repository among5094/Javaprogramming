package ex4_1;
//ex4-3e
public class Circle {
	
	//필드
	int radius; //멤버 변수
	String name; //멤버 변수
	
	//매개변수가 없는 생성자
	public Circle() {
		
		int radius=1; //생성자에서부터 1로 초기화했음
		String name=""; //아무 값도 주지 않았다.
	}//고칠점: 앞에 data type 안 붙여도 된다. 
	
	//매개변수가 2개인 생성자
	public Circle(int r, String n){
		
		int radius=10; //생성자 안에서 초기화 해주기
		String name = "매개변수가 2개인 생성자";
		
	}
	
	//메소드
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	
	
	//메인메소드
	public static void main(String[] args) { 
		
		//객체1
		Circle pizza; //객체 이름 pizza
		pizza=new Circle(10, "자바피자"); //객체 생성
		
		
		double area=pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		//객체2
		Circle donut= new Circle(); //객체 이름 지정(레퍼런스)와 동시에 생성과 선언
		
		//donut.radius=2;
		donut.name="자바도넛";
		area=donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
		
		
		
		
	}//main method끝


}//Circle class 끝