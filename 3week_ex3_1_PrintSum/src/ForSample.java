//03월 21일 화요일 예제3번
public class ForSample {
	
	public static void main(String[] args) {
		
		int i,sum=0;
		
		for(i=1; i<=10; i++) {
			sum += i;
			System.out.print(i); //더하는 수 출력
			
			if(i<=9) //1~9까지는 '+'출력
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.print(sum);
			}//else닫기
			
			
		}//for문 닫기
		
		
	}//main class닫기

}
