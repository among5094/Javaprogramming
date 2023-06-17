package ex9_1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//extends는 클래스 확장, 다중상속x,  implements는 인터페이스 구현, 다중상속을 가능케 한다. 

public class IndepClassListener extends JFrame {//JFrame를 상속받아서 창을 띄움
	
	//생성자 만들기 -> 대부분 생성자에서 완료하고 main의 기능은 최소로 줄인다.
	IndepClassListener(){
		setTitle("Action 이벤트 리스너 예제");//super()로 대체가능
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우가 닫힐 때,프로그램도 함께 종료
		Container c = getContentPane();//컨텐트팬 알아내기
		//JFrame객체가 처음 생길 때 컨텐트팬은 자동으로 생성된다. 프레임에 붙어 있는 컨텐트팬을 알아내기 위해서
				//컨텐트팬을 알아내기 위해서는 JFrame클래스의 getContentPane()메소드를 호출해야한다. 
		c.setLayout(new FlowLayout());//컨텐트팬에 FlowLayout 배치관리자 달기
		
		JButton btn = new JButton("Action"); 
		btn.addActionListener(new MyActionListener());//이벤트처리에 관련된 부분
		c.add(btn);//버튼 추가
		setSize(300,400); //창 크기 설정
		setVisible(true); //화면에 프레임 출력
	}//생성자 끝
	
	public static void main(String[] args) {
		new IndepClassListener(); //객체 만들기
	}
}

//독립된 클래스로 이벤트 리스너 작성
/* 상속
 * extends : 클래스 확장(다중상속x)
 * implements : 인터페이스를 구현하는 것(다중상속을 위해서 이 키워드를 씀)
*/
class MyActionListener implements ActionListener{ 
	
	//객체 e에 업캐스팅이 일어남, ActionEvent가 object타입이라서 >>업캐스팅<<이 리어남
	public void actionPerformed(ActionEvent e) {
		
		//ActionListener 여기 안에 있는 추상메소드를 구현
		JButton b = (JButton)e.getSource(); //JButton으로 >>다운캐스팅<< 한다.
		if(b.getText().equals("Action"))//문자열이 "Action"과 같으면?
			b.setText("액션");
		else
			b.setText("Action");
	}
}

