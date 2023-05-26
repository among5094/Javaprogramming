package ex6_7;
import java.util.StringTokenizer;
//배열로 나눠서 
public class StringTokenizerEx {
	public static void main(String[] args) {
		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st=new StringTokenizer(query, "&"); //객체st
		
		int n=st.countTokens(); //분리된 토큰의 개수
		System.out.println("토큰 개수 = "+ n);
		
		//이 while문은 모든 토큰을 꺼낼 때 자주 쓴다. 
		while(st.hasMoreTokens()) {
			String token = st.nextToken(); //토큰 얻기
			System.out.println(token); //토큰 출력
		}
	}
}
