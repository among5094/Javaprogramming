import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*리스너란? 
 * 리스너는 단어의 뜻으로 보자면 (소리를) 듣는 사람, 청취자입니다.
 * 프로그래밍에서의 리스너는 무언가 소리를 듣는 사람을 뜻하기 보다는
 * 특정 이벤트(특정한 사건)가 발생하기를 '귀 기울여' 기다리다가 실행되는 컴포넌트(메서드나 함수)를 말한다.*/

public class MouseEventAllEx extends JFrame {
	JLabel la = new JLabel("Move Me"); // 필드로 쓰기 위해서

	// 생성자
	MouseEventAllEx() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x를 누를 때 프로그램 종료
		Container c = getContentPane(); // 컨텐트팬 알아내기
		// JFrame객체가 처음 생길 때 컨텐트팬은 자동으로 생성된다. 프레임에 붙어 있는 컨텐트팬을 알아내기 위해서
		// 컨텐트팬을 알아내기 위해서는 JFrame클래스의 getContentPane()메소드를 호출해야한다.

		// MyMouseListener는 내부클래스임
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);

		c.setLayout(null);

		la.setSize(80, 20);
		la.setLocation(100, 80);
		c.add(la); // 레이블 컴포넌트 삽입

		setSize(300, 200);
		setVisible(true);

	}

	// 내부클래스
	class MyMouseListener extends MouseAdapter {

		// 마우스 버튼이 눌려졌을 때
		public void mousePressed(MouseEvent e) {
			la.setLocation(e.getX(), e.getY()); // x,y좌료값을 얻어서 객체 la에 넣기
			setTitle("mousePressed(" + e.getX() + "," + e.getY() + ")"); // title변경
		}

		// 마우스 버튼이 눌려졌을 때
		public void mouseReleased(MouseEvent e) {// 눌러진 버튼이 떼어질 때
			la.setLocation(e.getX(), e.getY()); // x,y좌료값을 얻어서 객체 la에 넣기
			setTitle("mousePressed(" + e.getX() + "," + e.getY() + ")"); // title변경
		}

		// public void mouseClicked(MouseEvent e) {} -> implements로 구현했다면 추상메소드를 오버라이딩 해줘야됨

		// 마우스가 특정 영역에 들어갔을 때 -> 마우스가 컴포넌트 위에 올라갈 때
		public void mouseEntered(MouseEvent e) {
			Component comp = (Component) e.getSource();
			comp.setBackground(Color.CYAN);
		}

		// 마우스가 특정 영역에서 나갔을 때 -> 마우스가 컴포넌트에서 내려올 때
		public void mouseExited(MouseEvent e) {
			Component comp = (Component) e.getSource();
			comp.setBackground(Color.YELLOW);
		}
		
		//마우스가 드래그될 때
		public void mouseDragged(MouseEvent e) {
			la.setLocation(e.getX(), e.getY()); // x,y좌료값을 얻어서 객체 la에 넣기
			setTitle("mousePressed(" + e.getX() + "," + e.getY() + ")"); // title변경
		}

		//마우스가 움직이는 동안 mouseMoved 라는 문자열이 쫓아다님
		public void mouseMoved(MouseEvent e) {
			la.setLocation(e.getX(), e.getY()); // x,y좌료값을 얻어서 객체 la에 넣기
			setTitle("mouseMoved(" + e.getX() + "," + e.getY() + ")"); // title변경
		}
		
		public static void main(String[] args) {
			new MouseEventAllEx();
			
		}

	}
}
