import java.util.Scanner;//스캐너 쓰기 위해

public class Season {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("월(1~12)를 입력하세요");
		int month=scanner.nextInt(); //정수로 월 입력
		
		switch(month) {
		
			case 3: case 4: case 5:
				System.out.println("봄입니다.");
			break; //반복문 스위치 탈출
			
			case 6: case 7: case 8:
				System.out.println("여름 입니다."); break;
				
			case 9: case 10: case 11:
				System.out.println("가을 입니다."); break;
				
			case 12: case 1: case 2:
				System.out.println("겨울 입니다."); break;
			
			default:
				System.out.println("잘못된 입력값입니니다.");
		
		}//switch끝
		
		scanner.close();
		
	}
}
