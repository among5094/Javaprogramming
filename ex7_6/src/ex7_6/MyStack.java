package ex7_6;
import java.util.*;

class GStack<T>{
	int TopPointer; //현재 가리키고 있는 top pointer
	Object[] stck; //string나 int 타입 전부 들어갈 수 있어야 하니까
	public GStack() {
		TopPointer=0; //초기화
		stck = new Object[10]; //stack의 size
		
	}
	
	public void push(T item) {
		
		if(TopPointer == 10)return; //overflow검사
		stck[TopPointer] = item;
		TopPointer++; 		
	}
	
	public T pop() {
		if(TopPointer == 0) return null; //underflow검사
		
		TopPointer--;
		return (T)stck[TopPointer];
		
	}
}

public class MyStack {
	public static void main(String[] args) {
		GStack <String> stringStack = new GStack <String>();
		stringStack.push("seoul");
		stringStack.push("seoul");
		stringStack.push("seoul");
	}
}
