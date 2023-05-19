package ex6_3;

class Point{
	int x,y;
	public Point(int x,int y) {
		this.x=x; this.y=y;
	}
	public boolean equals(Point p) {//오버라이딩 해줌
		if(this.x==p.x && this.y == p.y) return true;
		else return false;
	}
}
public class EqualsEx {
	public static void main(String[] args) {
		Point a=new Point(2,3); //각각 완전히 다른 객체임
		Point b=new Point(2,3);
		Point c=new Point(3,4);
		
		if(a==b) System.out.println("a==b");
		//if(a와 b가 가리키는 것이 같은가?) -> false 
		if(a.equals(b)) System.out.println("a is equal to b");
		//if(객체 a,b의 내용물이 같은가?) -> true
		if(a.equals(c)) System.out.println("a is equal to c");
		//if(객체 a,c의 내용물이 같은가?) -> false
	}
}
