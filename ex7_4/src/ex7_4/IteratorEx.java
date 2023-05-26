package ex7_4;
import java.util.*;


public class IteratorEx {
	public static void main(String[] args) {
		
		//정수값만 다루는 제네릭 벡터 생성
		Vector <Integer> v = new Vector<Integer>();
		v.add(5); //0번째 index에 삽입
		v.add(4); //1번째 index에 삽입
		v.add(-1); //2번째 index에 삽입
		v.add(2,100); //4와-1 사이에 정수 100 삽입
		
		//Iterator를 이용한 모든 정수 출력하기
		Iterator<Integer> it= v.iterator(); //Iterator 객체 얻기
		
		while(it.hasNext()) { //next할게있어?
			int n = it.next();//있으면 하나씩 꺼냄
			System.out.println(n); //그리고 출력
		}
		
		//Iterator을 이용하여 모든 정수 더하기
		int sum=0;
		it = v.iterator(); // iterator 객체 얻기
		//그냥 원본을 꺼내면 텅 비게되니까 똑같이 >>>복사<<<해줌
		
		while(it.hasNext()) { //next할게있어?
			int n = it.next();//있으면 하나씩 꺼냄
			sum += n; //그리고 sum에 계속 더해주기
		}
		System.out.println("벡터에 있는 정수의 합: "+ sum);
	}
}
