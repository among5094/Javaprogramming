package ex5_2;

class Point{
	private int x,y; //한 점을 구성하는 x,y좌표
	public Point(){ //5-1예제에서는 멤버 함수 set으로 초기화해줬는데 5-2에서는 생성자로 초기화해줌
		this.x=this.y=0;
	}
	public Point(int x, int y) {
		this.x=x; this.y=y;
	}
	public void showPoint() {//점의 좌표 출력
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point{//point를 상속받은 ColorPoint
	
	private String color; //점의 색
	public ColorPoint(int x, int y, String color){//5-1에서는 함수로 호출했지만 5-2에서는 생성자로 호출
		super(x,y); //this.x는 안됨. private니까 //super가 없으면 기본 생성자로 감
		this.color=color;
	}
	public void showColorPoint() {//컬러 점 좌표 출력
		System.out.print(color); //색깔먼저 출력-> blue라는 string부터 출력
		showPoint(); //Point의 showPoint()호출
	}
}

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint cp=new ColorPoint(5,6,"blue");
		cp.showColorPoint();
	}

}
