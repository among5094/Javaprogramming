package ex8_2;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;// new FlowLayout() 이 임포트문 없으면 이거 안됨


public class ContentPanEx extends JFrame {
	
	//생성자
	ContentPanEx(){
		
		setTitle("냥냥멍뭉");
		
		setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setBackground(Color.yellow); //배경색 설정
		//cp.setLayout(new FlowLayout(FlowLayout.LEFT,20,20)); //setLayout -> 배치방식 결정, 
		//FlowLayout()이거는 클래스라서 객체를 만들어줘야한다. 그래서 new써야함
		//FlowLayout(())
		
		
		cp.setLayout(new BorderLayout(10,10));
		JButton b1 = new JButton("OK"); //버튼 생성, 버튼 이름b1
		cp.add(b1, BorderLayout.CENTER);
		
		//버튼 생성, 위에 같은 문장
		cp.add(new JButton("Cancel"), BorderLayout.WEST);
		cp.add(new JButton("Ignore"), BorderLayout.EAST);
		
		cp.add(new JButton("AA"), BorderLayout.NORTH);
		cp.add(new JButton("BB"), BorderLayout.SOUTH);
		//cp.add(new JButton("Ignore"));
		//cp.add(new JButton("Ignore"));
		
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContentPanEx();
	}
}
