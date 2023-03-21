import java.util.Scanner;//스캐너 쓰기 위해
//switch써보기


public class Grading_2 {
	

	//main class시작
	public static void main(String[] args) {
			
			char grade; //학점
			Scanner scanner = new Scanner(System.in); //스캐너 쓰기 위해
			
			System.out.print("점수를 입력하세요(0~100): ");
			
			int score=scanner.nextInt(); //점수 읽기
			
			switch(score/10) {
			
				case 9: case 10: //10은 100점인 경우
					grade='A'; break;
			
				case 8:
					grade='B'; break;
					
				case 7:
					grade='C'; break;
				
				case 6:
					grade='D'; break;
					
				//else에 해당하는 부분
				default:
					grade='F';
			
			
			}//switch문
			
			System.out.println("학점은" + grade + "입니다.");
			scanner.close();//반환

		}

}
