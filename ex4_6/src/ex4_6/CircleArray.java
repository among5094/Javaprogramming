package ex4_6;

class Circle{
	int radius; //필드, 멤버변수
	
	public Circle(int radius) {
		this.radius=radius;
		//필드에서의 r = 지역변수 r
	}
	
	public double getArea() { //원의 면적을 구하는 메소드(함수)
		return 3.14*radius*radius;
	}
}//class닫기

public class CircleArray {
	
	public static void main(String[] args) {
		Circle c[]; //Circle타입의 배열 이름(레퍼런스) 선언
		c=new Circle[5]; //배열 생성
		
		for(int i=0; i<c.length; i++) {
			
			c[i]=new Circle(i); //
			System.out.println((int)(c[i].getArea())+" ");
		}
	}
}
