import java.util.Scanner;//스캐너 쓰기 위해

public class ArrayAccess {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[]; //배열 이름만 선언
		intArray = new int[5]; //배열 생성
		int max=0; //큰 수 저장하는 변수 선언
		
		System.out.println("양수 5개 입력: ");
		
		for(int i=0; i<5; i++) {
			
			intArray[i]=scanner.nextInt();//입력 받은 정수를 배열에 저장
			if(intArray[i]>max)
				max=intArray[i];
			
		}
		System.out.print("가장 큰 수는"+ max + "입니다.");
		scanner.close();
	}
}
