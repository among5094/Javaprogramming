package ex3_14_MH;
//예제 3-14
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.println("정수 3개를 입력하세요");
   int sum = 0, n = 0;
   
   // 3개의 정수 입력 받기 + 정수가 아닌 데이터 타입이 입력되었을 경우의 예외 처리
   for (int i = 0; i < 3; i++) {
      System.out.print((i + 1) + "번째 정수 >> ");
      try {
         n = scanner.nextInt(); // 정수 입력
      } catch(InputMismatchException e) {
         System.out.println("정수가 아닙니다. 다시 입력하세요.");
         scanner.next(); // 입력된 데이터 받긴하지만 따로 저장 안함 -> 버림
         i--; // 반복횟수 감소시켜서 잘못 입력한 번째수 정수 다시 입력 받기 
         continue; 
      }
      sum += n;
   }
   System.out.println("세 정수의 합은 " + sum + "입니다.");
   scanner.close();
}
}