class Sample{
	public int a;
	private int b;
	int c; //디폴트 
}

public class AccessEx {
	public static void main(String args[]) {
		Sample aClass=new Sample(); //객체 만들기 
		
		aClass.a=10;
		aClass.b=10; //b는 private이라서 접근 불가능
		aClass.c=10;
		
	}

}
