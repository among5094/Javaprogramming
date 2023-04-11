package ex4_2;
import java.util.Scanner;

//Rectangle
class Rectangle{
	
	//필드
	int width; //멤버 변수
	int height; //멤버 변수
	
	//메소드
	int getArea() { 
		return width*height;
	}
}

//public이 붙어 있는 것의 이름, 접근 지정자
public class RectApp {
	
	public static void main(String[] args) {//메인 메소드
		
		//객체 생성
		Rectangle rect = new Rectangle();
		
		//스캐너 객체 생성
		Scanner sc=new Scanner(System.in);
		System.out.print(">>");
		
		rect.width=sc.nextInt();
		rect.height=sc.nextInt();
		
		System.out.println("사각형의 면적은"+rect.getArea());
		sc.close();
	}


}
