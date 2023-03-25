
import java.util.Scanner;//스캐너 쓰기 위해

public class ContinueExample {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
		int sum=0; //합계를 저장하는 변수 
		
		for(int i=0; i<5; i++) {
			
			int n=scanner.nextInt();
			if(n<=0)
				continue;
			else
				sum += n;//양수일 때 덧셈
		}//for문 끝
		
		System.out.println("양수의 합은"+sum);
		
		scanner.close();
	}

}
