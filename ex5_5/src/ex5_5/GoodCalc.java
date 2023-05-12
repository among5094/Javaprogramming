package ex5_5;

abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int sub(int a, int b);
	public abstract double avg(int[] a);
}

public class GoodCalc extends Calculator {
	
	public int add(int a, int b) {//추상메소드 구현
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public double avg(int[] a) {
		double sum=0; 
		
		for(int i=0; i<a.length; i++)
			sum+=a[i];
		
		return sum/a.length;
		
	}
	public static void main(String[] args) {
		GoodCalc c= new GoodCalc(); //객체생성
		System.out.println(c.add(2, 3));
		System.out.println(c.sub(2, 3));
		System.out.println(c.avg(new int[] {2,3,4}));
	}

}
