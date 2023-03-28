import java.util.Scanner;//스캐너 쓰기 위해

public class foreachEx {
	
	public static void main(String[] args) {//메인 메소드
		
		int n[]= {1,2,3,4,5}; //배열 선언
		int sum=0;
		for(int k:n) {
			System.out.print(k+" ");
			sum += k;
		}
	
		System.out.println("합은"+sum);
		
		String f[]= {"사과", "배", "바나나", "블루베리", "메론", "딸기"};
		for(String s:f)
			System.out.print(s+" ");
		
		
	}//main메소드 닫기
		

}
