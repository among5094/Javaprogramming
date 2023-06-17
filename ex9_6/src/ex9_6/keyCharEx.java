package ex9_6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//안됨 왜 안되지???

public class keyCharEx extends JFrame {
	
	JLabel la= new JLabel("<Enter>를 누르면 배경 색상이 바뀝니다.");
	
	keyCharEx(){
		
		super("KeyListener의 문자 키 입력 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우가 닫힐 때,프로그램도 함께 종료
		Container c = getContentPane();//컨텐트팬 알아내기
		//JFrame객체가 처음 생길 때 컨텐트팬은 자동으로 생성된다. 프레임에 붙어 있는 컨텐트팬을 알아내기 위해서
		//컨텐트팬을 알아내기 위해서는 JFrame클래스의 getContentPane()메소드를 호출해야한다. 
		c.setLayout(new FlowLayout());
		c.add(la);
		
		//이벤트 처리에 관련된 부분
		c.addKeyListener(new MykeyListener());//keyEvent를 받을 대상을 c로 지정
		setSize(250,150);
		setVisible(true);
		
		c.setFocusable(true); //포커스를 받을 수 있도록 설정
		c.requestFocus(); //컨텐트팬에 포커스 설정, 무조건 마지막이여야한다. 
		
	}
	
	//내부클래스
	public class MykeyListener extends KeyAdapter{//추상메소드 안 쓰기
		
		public void KeyPressed(KeyEvent e) {
			
			//임의의 색을 만들기 위해 랜덤하게 r,g,b 성분 생성
			int r=(int)(Math.random()*256); 
			int g=(int)(Math.random()*256); 
			int b=(int)(Math.random()*256); 
			System.out.println(e.getKeyChar());
			switch(e.getKeyChar()) {//입력된 키 문자
			
			case '\n'://엔터키가 입력되면?
				System.out.println("냥냥");
				la.setText("r = "+r+", g = "+ g + ", b = " +  b);
				getContentPane().setBackground(new Color(r,g,b));
				break;
			case 'q':
				System.exit(0);
			}//switch문 닫기
		}
	}//내부 클래스 닫기
	
	public static void main(String[] args) {
		new keyCharEx(); //객체 생성
		
	}//메인메소드 닫기
}
