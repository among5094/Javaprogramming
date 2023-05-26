package ex7_2;
import java.util.Vector;

class Point{
	private int x,y; 
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
}

public class PointVectorEx {
	public static void main(String[] args) {
		Vector <Point> v = new Vector<Point>();
		
		v.add(new Point(2,3)); //0번째 index에 삽입
		v.add(new Point(-5,20)); //1번째 index에 삽입
		v.add(new Point(30,-8)); //2번째 index에 삽입
		
		v.remove(1); //1번째 index 삭제
		
		for(int i=0; i<v.size(); i++) {
			Point p=v.get(i); //벡터의 i번째의 Point 객체 얻어내기 
			System.out.println(p); 
		}
		
	}

}
