package ex3_14;
import java.util.Scanner;//스캐너 쓰기 위해

public class InputMismatchException {
	
	public static void main(String[] args) {//메인 메소드
		
		Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
		
		System.out.println("정수 3개를 입력하세요");
		int sum=0,n=0;
		
		for(int i=0; i<3; i++) {
			System.out.println(i+">>");
			
			try {
				n=scanner.nextInt();
			}catch(InputMismatchException e){
				System.out.println("정수가 아닙니다. 다시 입력하세요");
				scanner.next(); //일단 입력은 다 받음
				i--; //
				continue;
				
			}
			
			sum+=n; //합하기
		}
		System.out.println("합은"+sum);
		scanner.close();
		
	}

	
	

}
