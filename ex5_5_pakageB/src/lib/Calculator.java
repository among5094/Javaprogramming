package lib;

//오류난 이유: public을 안 해줘서 ab앞에 pu붙어야됨
public abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int sub(int a, int b);
	public abstract double avg(int[] a);
}
