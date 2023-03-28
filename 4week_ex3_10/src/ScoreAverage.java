import java.util.Scanner;//스캐너 쓰기 위해

public class ScoreAverage {
	
	public static void main(String[] args) {//메인 메소드
		
		Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
		
		//시험 값을 미리 주기
		/*
		double score[][]= {
				{3.3, 3.4},
				{3.5, 3.6},
				{3.7, 4.4},
				{4.3, 4.5},
		}; //score배열 닫기
		 */
		
		//입력 받아보기 
		
		
		
		
		
		double sum=0;
		
		for(int year=0; year<score.length; year++) {
			for(int term=0; term<score[year].length; term++)
				sum += score[year][term]; //전체 평점 합
		}//중첩 반복문 닫기
		
		int n=score.length; 
		int m=score[0].length;
		
		System.out.println("4년 전체 평점 평균은 "+sum/(n*m));
		
		scanner.close();
		
	}//main메소드 닫기
	
	

} //class닫기
