import java.util.Scanner;
public class ArrayLenght {
	
	public static void main(String[] args) {//메인 메소드
	
		Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
		
		System.out.println("5개의 정수를 입력하세요.");
		int intAraay[] = new int[5];
		
		double sum=0.0;
		for(int i=0; i<intAraay.length; i++) //5번
			intAraay[i]=scanner.nextInt();  //키보드에서 입력받은 정수 저장
		
		for(int i=0; i<intAraay.length; i++) //5번
			sum=sum+intAraay[i]; //배열에 저장된 정수 값 더하기 
		
		System.out.print("평균은"+sum/intAraay.length);
		scanner.close();
	}
}
