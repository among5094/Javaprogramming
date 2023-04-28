package ex4_9;

public class GarbageEx {
	
	public static void main(String args[]) {
		String a=new String("Good");
		String b=new String("Bad");
		String c=new String("Normal");
		String d,e; //이름
		
		/*
		a=null;
		d=c;
		c=null;
		*/
		
		c=b;
		b=null;
	}

}
