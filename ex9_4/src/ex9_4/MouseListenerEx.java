package ex9_4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//창의 띄우기 위해 JFrame 상속받기
public class MouseListenerEx extends JFrame {
	
	JLabel la = new JLabel("Hello");
	//필드로 쓰기 위해서 생성자 밖에 선언 -> 내부클래스에도 쓸려구
	
	//생성자 선언
	MouseListenerEx(){
		super("Mouse 이벤트 예제"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우가 닫힐 때,프로그램도 함께 종료
		Container c = getContentPane();//컨텐트팬 알아내기
		//JFrame객체가 처음 생길 때 컨텐트팬은 자동으로 생성된다. 프레임에 붙어 있는 컨텐트팬을 알아내기 위해서
		//컨텐트팬을 알아내기 위해서는 JFrame클래스의 getContentPane()메소드를 호출해야한다. 
		
		//이벤트 처리에 관련된 부분
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);//배치관리자 제거를 위해 null 선언, default는 borderLayout(5방위)이다. 
		la.setSize(50,20); //레이블의 크기 50,20하기
		la.setLocation(30,30); //왼쪽 상단 모서리를 기준으로 x,y좌표 30,30으로 "위치" 설정
		c.add(la);
		
		setSize(200,200); //창 크기
		setVisible(true); //우리 눈에 보이게 
	}
	
	//내부클래스
	class MyMouseListener implements MouseListener{
		
		//마우스 누를 때 -> 추상메소드 구현
		public void mousePressed(MouseEvent e) {
			//커서의 위치를 x,y로 저장
			int x=e.getX(); //마우스의 클릭 좌표x
			int y=e.getY();
			la.setLocation(x,y); //(x,y)위치로 레이블 이동
			
		}
		//추상메소드 5개중 4개
		//구현은 했는데 내용은 없다. 그렇기 때문에 추상메소드는 아니고 일반 메소드임
		public void mouseReleased(MouseEvent e) {}//마우스 뗄 때
		public void mouseClicked(MouseEvent e) {}//클릭될 때
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		
	}
	
	public static void main(String[] args) {
		new MouseListenerEx(); //객체 생성
	}//메인메소드 닫기
	
}//메인클래스 닫기
