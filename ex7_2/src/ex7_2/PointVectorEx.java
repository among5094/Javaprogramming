package ex7_2;
import java.util.Vector;

//클래스를 만든다.
class Point{
	private int x,y; 
	
	//역할: x,y 필드를 초기화하는 생성자
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	//toString는 object클래스를 오버라이딩 한 것
	public String toString() {
		return "("+x+","+y+")";
	}
}

public class PointVectorEx {
	public static void main(String[] args) {
		
		//Point클래스의 객체만 다루는 벡터 활용하기
		Vector <Point> v = new Vector<Point>();
		
		v.add(new Point(2,3)); //0번째 index에 삽입
		v.add(new Point(-5,20)); //1번째 index에 삽입
		v.add(new Point(30,-8)); //2번째 index에 삽입
		
		v.remove(1); //1번째 index 삭제
		
		//벡터에 있는 Point 객체 모두 검색해서 출력
		for(int i=0; i<v.size(); i++) {
			Point p=v.get(i); //벡터의 i번째의 Point 객체 얻어내기 
			System.out.println(p); //toString()를 이용해서 객체 p출력
		}
	}
}
