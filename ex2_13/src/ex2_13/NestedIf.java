package ex2_13;
import java.util.Scanner;
public class NestedIf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("점수를 입력하세요: ");
		int score = sc.nextInt();
		System.out.println("학년을 입력하세요: ");
		int year = sc.nextInt();
		
		//첫 번째 if문 -> 60점이 넘는지 아닌지
		if(score>=60) {
			
			//두 번째 if문
			if(year != 4)
				System.out.println("합격입니다!");
			else if(score>=70)
				System.out.println("합격입니다!");
			else
				System.out.println("불합격입니다.");
		}
		else//60점 미만은 불합격
			System.out.println("불합격입니다.");
		
		sc.close();
		
	}//메인메소드 닫기
}//class닫기
