package ex6_5;

public class WrapperEx {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A')); 
		char c1='4', c2='F';
		
		if(Character.isDigit(c1)) //Digit(10진수 숫자), 문자4를 숫자화할 수 있어?
			System.out.println(c1+" 은 숫자");
		if(Character.isAlphabetic(c2)) //F는 알파벳이냐? -> true
			System.out.println(c2+" 는 영문자");
	}
}
