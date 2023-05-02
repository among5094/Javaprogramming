package ex5_1;

class Point{
	private int x,y; //점
	
	//설정 역할
	void set(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	//점의 좌표 출력
	void showPoint() {
		System.out.println("("+x+","+"y"+")");
	}
}

class ColorPoint extends Point{
	
	private String color; //점의 색
	void setColor(String color) {
		this.color=color;
	}
	
	//컬러 점 좌표 출력
	void showColorPoint() {
		System.out.print(color);
		showPoint(); //Point의 showPoint()호출
	}
	
}

public class ColorPointEx {
	
	public static void main(String[] args) {
		Point p = new Point();
		p.set(1,2);
		p.showPoint();
		
		ColorPoint cp=new ColorPoint();
		cp.set(3,4);
		cp.setColor("red");
		cp.showColorPoint();
	}

}
