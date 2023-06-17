package ex9_6_2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//자바 예제 9_6 2try , K와 k 신경쓰기

public class KeyCharEx extends JFrame{//창을 띄우기 위해 JFrame 상속받기, JFrame: 최상위 컨테이너
	JLabel la = new JLabel("<Enter>키로 배경색이 바뀝니다. "); //super로 작성해도 됨
	
	//생성자
	KeyCharEx(){
		super("KeyListener의 문자 키 입력 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우가 닫힐 때,프로그램도 함께 종료
		Container c = getContentPane();//컨텐트팬 알아내기
		//JFrame객체가 처음 생길 때 컨텐트팬은 자동으로 생성된다. 프레임에 붙어 있는 컨텐트팬을 알아내기 위해서
		//컨텐트팬을 알아내기 위해서는 JFrame클래스의 getContentPane()메소드를 호출해야한다. 
		c.setLayout(null);
		c.add(la);
		c.addKeyListener(new MyKeyListener());//키 이벤트를 받을 대상을 c로 지정
		
		setSize(200,200); //창 크기 200,200
		setVisible(true);
		
		c.setFocusable(true);//포커스를 받을 수 있도록 지정
		c.requestFocus();//컨텐트팬에 포커스 설정
		
	}
	
	//내부클래스, 이벤트 리스너 클래스
	class MyKeyListener extends KeyAdapter{//KeyAdapter는 추상메소드를 하나씩 다 구현하지 않아도 된다.
		
		public void keyPressed(KeyEvent e) {
			//임의의 색을 만들기 위해 랜덤하게 r,g,b, 성분 생성
			int r = (int)(Math.random()*256); //0부터 256까지인데 0부터 시작하니까 +1하기
			int g = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);
			
			switch(e.getKeyChar()) { //입력된 키 문자가
			case '\n': //엔터키 입력
				la.setText("냥");
				la.setText("r ="+ r +", g="+ g +", b = "+ b);
				getContentPane().setBackground(new Color(r,g,b));
				break;
				
			case 'q':
				System.exit(0);
			
			}//switch닫기
		}//keyPressed메소드 닫기	
	}//내부 클래스, 이벤트 리스너 클래스 닫기
		
	
	public static void main(String[] args) {
		new KeyCharEx();
	}//메인메소드 닫기
}
