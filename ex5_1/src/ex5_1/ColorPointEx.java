package ex5_1;

class Point{
	private int x,y; //점, 접근지정자 private임!
	
	// --생성자 아님! 멤버 메소드임!
	public void set(int x,int y) {//설정 역할
		this.x=x; this.y=y;
	}
	public void showPoint() {//점의 좌표 출력
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point{
	private String color; //점의 색
	
	public void setColor(String color) {
		this.color=color; //같은 class에 있으니까 private라도 접근이 가능하다
	}
	
	
	public void showColorPoint() {//컬러 점 좌표 출력
		System.out.print(color);
		showPoint(); //Point의 showPoint()호출 (public임, 생성자 아님)
	}
	
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point(); //이름이 p인 point 객체 생성
		p.set(1,2); //point 클래스의 set 멤버 함수 호출(public임)
		p.showPoint();//point 클래스의 showPoint 멤버 함수 호출(public임)
		
		ColorPoint cp = new ColorPoint(); //이름이 cp인 ColorPoint 객체 생성
		cp.set(3,4); //ColorPoint 클래스의 멤버 함수 set()호출
		cp.setColor("red"); //ColorPoint의 클래스에 있는 멤버 변수 color은 private니까 멤버 함수(public임)로 접근한다. 
		cp.showColorPoint(); //ColorPoint 클래스의 멤버 함수 showColorPoint에 접근(public임) 
	}

}
