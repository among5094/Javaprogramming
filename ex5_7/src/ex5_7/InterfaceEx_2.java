package ex5_7;
//ex5-6을 보고 5-7을 만들어보기
//

interface PhoneInterface{
	final int TIMEOUT = 1000; //상수 필드 선언, public static이 생략
	void sendCall(); //public abstract
	void receiveCall();
	default void printLogo() {
		System.out.println("**Phone**");
	}
}
//조건1: SmartPhone 클래스는 calc의 상속을 받아야됨
class calc{
	public int calculate(int x,int y) {return x+y; }
}

class SmartPhone extends calc implements PhoneInterface{//인터페이스 구현
	//PhoneInterface의 추상 메소드 구현
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	public void receiveCall() {
		System.out.println("전화가 왔습니다. ");
	}
	//메소드 추가 작성
	public void schedule(){System.out.println("일정관리합니다."); }
}

public class InterfaceEx_2 {
	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone(); //객체 생성
		phone.printLogo();
		phone.sendCall();
		System.out.println("3과 5를 더하면"+phone.calculate(3, 5));
		phone.schedule();
	}
}
