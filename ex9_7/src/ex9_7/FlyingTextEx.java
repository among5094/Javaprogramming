package ex9_7;
//예제 9-7: 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlyingTextEx extends JFrame {//윈도우에 창을 띄우기 위해 JFrame
	JPanel cp=new JPanel();//The JPanel is a simplest container class //벽지
	JLabel la = new JLabel("Hello");
	
	//생성자
	FlyingTextEx() {
		super("상,하,좌,우 키를 이용해서 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x를 누를 때 프로그램 종료
		setContentPane(cp); //벽지 붙이기
		cp.setLayout(null); // 벽지의 레이아웃을 널로 하기
		cp.addKeyListener(new MyKeyListener());//컴포넌트에 키 이벤트 리스너를 등록하기 위해서
		
		la.setLocation(50,50);// 객체 la의 위치를 왼쪽 상단 모서리 기준 50,50에 위치
		la.setSize(100,20); //객체 la의 크기 자체를 가로100, 세로20으로 설정
		cp.add(la); //벽지 cp에 la붙이기
		
		setSize(200,200); //창 크기 200,200
		setVisible(true);
		
		//ppt-> cp.requestFocus(); //키 이벤트를 받을 컴포넌트를 강제로 설정
		cp.setFocusable(true);//키 이벤트의 포커스를 받을 수 있는 컴포넌트가 여러개 있을 때, 우선적으로 입력받기 위해 설정
		
	}
	
	//Adapter를 사용하면 추상 메소드를 하나씩 쓰지 않아도 된다. 
	class MyKeyListener extends KeyAdapter{//내부클래스
		
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); //입력된 키 코드
			switch(keyCode) {
			
			case KeyEvent.VK_UP://↑키가 눌리면?
				la.setLocation(la.getX(),la.getY()-10);
				break;
			case KeyEvent.VK_DOWN://↓키가 눌리면?
				la.setLocation(la.getX(),la.getY()+10);
				break;
			case KeyEvent.VK_LEFT://←키가 눌리면?
				la.setLocation(la.getX()-10,la.getY());
				break;
			case KeyEvent.VK_RIGHT://↑키가 눌리면?
				la.setLocation(la.getX()+10,la.getY());
				break;
			}//switch문 닫기
		}
	}//내부클래스 닫기
	
	public static void main(String[] args) {
		new FlyingTextEx();
	}
	
}
