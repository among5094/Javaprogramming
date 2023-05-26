package ex7_3;
import java.util.*;
public class ArrayListEx {
	
	public static void main(String[] args) {
		
		//문자열만 삽입 가능한 ArrayList 컬렉션 생성
		ArrayList<String> a = new ArrayList<String>();
		
		//키보드로부터 4개의 이름을 입력받아서 ArrayList에 삽입
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요>> ");
			String s=sc.next(); //키보드로부터 이름을 입력받음
			a.add(s); //ArrayList컬렉션에 삽입
		}
		
		//ArrayList에 들어 있는 모든 이름 출력
		for(int i=0; i<a.size(); i++) {
			
			//ArrayList의 i번째 문자열 얻어오기
			String name =a.get(i);
			System.out.print(name+" ");
			
		}
		
		//가장 긴 이름 출력 -> Algorithm: 순차탐색
		int longestIndex = 0; //0번째 index가 가장 크다고 가정
		
		for(int i=0; i<a.size(); i++) {
			
			//0번째 index가 크다고 가정한 것과 1번째 인덱스의 문자열 길이와 비교!
			if(a.get(longestIndex).length() < a.get(i).length())
				longestIndex= i; //만약 새로 들어온 문자열의 길이가 더 길면 longestIndex에 저장
		}		
		
		//결국 longestIndex에는 글자수가 가장 긴 index저장됨.
		System.out.print("\n가장 긴 이름은: "+ a.get(longestIndex));		
		
		
		sc.close();
	}	
}
