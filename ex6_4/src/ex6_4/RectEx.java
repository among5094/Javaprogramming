package ex6_4;

class Rect{
	int width,height;
	public Rect(int width, int height) {
		this.width=width; this.height=height;
	}
	//오버라이딩 하기
	public boolean equals(Object obj) {
		Rect p=(Rect)obj; //obj를 Rect타입으로 다운 캐스팅
		if(this.width*this.height == p.width*p.height) //p는 다운캐스팅으로 인해 Rect타입이 됨.
			return true;
		else
			return false;
	}
}
public class RectEx {
	public static void main(String[] args) {
		Rect a = new Rect(2,3);//면적6
		Rect b = new Rect(3,2);
		Rect c = new Rect(3,4);
		
		//객체의 내용물을 비교함
		//Rect a,b,c는 Object 타입으로 업캐스팅 되었다가 오버라이딩 한 equals메소드에서 다운캐스팅 된다. 
		if(a.equals(b)) System.out.println("a is equal to b");
		if(a.equals(c)) System.out.println("a is equal to c");
		if(b.equals(c)) System.out.println("b is equal to c");
	}
}
