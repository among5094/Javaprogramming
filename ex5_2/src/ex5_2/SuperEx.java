package ex5_2;

class Point{
	private int x,y; //점
	
	Point(){ //5-1예제에서는 멤버 함수 set으로 초기화해줬는데 5-2에서는 생성자로 초기화해줌
		this.x=this.y=0;
	}
	
	//점의 좌표 출력
	void showPoint() {
		System.out.println("("+x+","+"y"+")");
	}
}

class ColorPoint extends Point{
	
	private String color; //점의 색
	
	ColorPoint(int x, int y, String color){//5-1에서는 함수로 호출했지만 5-2에서는 생성자로 호출
		super(x,y); //this.x는 안됨. private니까 //super가 없으면 기본 생성자로 감
		this.color=color;
	} 
	
	//컬러 점 좌표 출력
	void showColorPoint() {
		System.out.print(color);
		showPoint(); //Point의 showPoint()호출
	}
	
}

public class SuperEx {
	public static void main(String[] args) {
		
	}

}
