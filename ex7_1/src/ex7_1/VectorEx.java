package ex7_1;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		
		//정수만 다루는 Vector<Integer> 제네릭 벡터를 생성하고 활용해보기
		Vector<Integer> v = new Vector<Integer>(); //
		v.add(5);
		v.add(4);
		/*
		Integer n = (Integer)v.get(1); //index 1번지의 값 가지고오기
		int k =n.intValue(); //k = 4
		*/
		v.add(-1);
		v.add(2,100); //2번index에 100삽입, 벡터 중간에 삽입하기
		
		//size와 용량 capacity는 다름!! 주의하기
		System.out.println("벡터 내의 요소 객체 수: "+v.size());
		System.out.println("벡터의 현재 용량: "+v.capacity());
		
		//모든 요소 정수 출력하기
		for(int i=0; i<v.size(); i++) {
			int n =v.get(i);
			System.out.println(n);
		}
		
		//벡터속 모든 정수 더하기
		int sum=0;
		for(int i=0; i<v.size(); i++) {
			int n=v.elementAt(i); //벡터의 i번째 정수
			sum +=n;
		}
		System.out.println("벡터 정수의 합: "+sum);
	}
}
