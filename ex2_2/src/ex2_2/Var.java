package ex2_2;

public class Var {
	
	//메인 메소드
	public static void main(String[] args) {
		var price=200; //price는 int형 타입으로 결정
		var name="Hyemin"; //name은 String타입으로 결정
		var PI = 3.14; //PI는 double타입으로 결정
		
		System.out.println("price = "+(price+1000));
		System.out.println("name = "+name);
		System.out.println("PI = "+PI*10);//더하기를 할때 숫자3.14가 아니라 문자열이 됨!
		
		//class - 1. 필드(class밖에) 2.메소드(class안에)
	}

}
