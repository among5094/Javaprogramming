package ex2_5;
import java.util.Scanner;


public class ScannerEx {
	
	public static void main(String[] args) {//메인 메소드
		
		System.out.println("이름,도시,나이,체중,독신 여부를 빈칸으로 분리하여 입력하세요: ");

		Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
		
		String name=scanner.next();
		System.out.println("당신의 이름은 "+name+"입니다.");
		String city=scanner.next();
		System.out.println("당신이 사는 도시는 "+city+"입니다.");
		
		
		int age=scanner.nextInt();
		System.out.println("당신이 사는 나이는 "+age+"입니다.");
		double weight=scanner.nextDouble();
		System.out.println("당신의 체중은 "+weight+"kg입니다.");
		
		//불린은 입력을 true 또는 false로 한다. 
		boolean single=scanner.nextBoolean(); 
		System.out.println("당신의 독신 여부는 "+single+"입니다.");
		
		
		scanner.close();

	}


}
