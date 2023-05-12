package ex5_6;

interface PhoneInterface{
	final int TIMEOUT = 1000; //상수 필드 선언, public static이 생략
	void sendCall(); //public abstract
	void receiveCall();
	default void printLogo() {
		System.out.println("**Phone**");
	}
}

class SamsungPhone implements PhoneInterface{//인터페이스 구현
	//메소드 오버라이딩
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	public void receiveCall() {
		System.out.println("전화가 왔습니다. ");
	}
	//메소드 추가 작성
	public void flash() {System.out.println("전화가기에 불이 켜졌습니다. "); }
}

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone(); //객체 생성
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
