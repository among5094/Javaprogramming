package ex4_6_2;
//예제 4-6 바꿔보기

class Rectangle{
	int width;
	int height;
	
	public Rectangle(int k) {
		this.width=k;
		this.height=k;
	}
	
	
	int getArea() {
		return width*height;
	}
}

public class RectApp {
	
	public static void main(String[] args) {
		
		//배열 생성, Rectangle rect = new Rectangle();
		Rectangle r[] =new Rectangle[5];
		for(int i=0; i<r.length; i++)
		{
			r[i]= new Rectangle(i);
			System.out.print(r[i].getArea()+ " ");
			
		}
	
	}
	

}
