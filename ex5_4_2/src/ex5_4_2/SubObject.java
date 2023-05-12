package ex5_4_2;

class SuperObject{
	protected String name;
	public void paint() {
		draw();
	}
	
	public void draw() {
		System.out.println(name);
	}
}

public class SubObject extends SuperObject{
	protected String name;
	public void draw();
}
