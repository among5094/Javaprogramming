package ex5_4;

class Shape{//도형의 슈퍼 클래스
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");//메소드 오버라이딩
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");//메소드 오버라이딩
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");//메소드 오버라이딩
	}
}

public class MethodOverridingEx {

	static void paint(Shape p) {
		
		p.draw(); //
	}
	public static void main(String[] args) {
		
		Line line = new Line(); //line객체 만들기
		paint(line); //Line의 draw실행
		
		paint(new Shape()); //
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}
