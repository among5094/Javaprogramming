package ex4_3;

//import ex4_1.Circle;

public class Circle_ex4_3 {
	
		//필드
		int radius; //멤버 변수
		String name; //멤버 변수
		
		//메소드
		public double getArea() {
			return 3.14*radius*radius;
		}
		
		public Circle_ex4_3();//매개변수가 없는 생성자
		
		

		public static void main(String[] args) { //메인메소드
			
			//객체1
			Circle pizza; //객체 이름 pizza
			pizza=new Circle(); //객체 생성
			
			pizza.radius=10; 
			pizza.name="자바피자";
			double area=pizza.getArea();
			System.out.println(pizza.name+"의 면적은 "+area);
			
			//객체2
			Circle donut= new Circle(); //객체 이름 지정(레퍼런스)와 동시에 생성과 선언
			
			donut.radius=2;
			donut.name="자바도넛";
			area=donut.getArea();
			System.out.println(donut.name+"의 면적은 "+area);
			
			
			
			
		}//main method끝


}
