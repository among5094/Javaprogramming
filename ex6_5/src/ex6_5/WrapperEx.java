package ex6_5;

public class WrapperEx {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A')); 
		char c1='4', c2='F';
		
		if(Character.isDigit(c1)) //Digit(10진수 숫자), 문자4를 숫자화할 수 있어?
			System.out.println(c1+" 은 숫자");
		if(Character.isAlphabetic(c2)) //F는 알파벳이냐? -> true
			System.out.println(c2+" 는 영문자");
		
		System.out.println(Integer.parseInt("28")); //문자열"28"을 10진수 28로 변환
		System.out.println(Integer.toString(28)); //정수 28을 문자열로 반환
		System.out.println(Integer.toBinaryString(28)); //28을 2진수의 문자열로 변환
		System.out.println(Integer.bitCount(28)); //28에 대한 2진수의 1의 개수 반화
		Integer i= Integer.valueOf(28);
		System.out.println(i.doubleValue());//
 	}
}
