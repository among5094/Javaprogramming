package ex2_4;

public class TypeConversion {
	
	public static void main(String[] args) {
		
		byte b=127; //byte는 1바이트
		int i=100;
		
		System.out.println(b+i); //1바이트와 4바이트면 큰 쪽(4byte) 따라간다. int타입으로 자동 형변환
		System.out.println(10/4); //2.5인데 2만 출력. 
		System.out.println(10.0/4); //double형 따라가니까 2.5출력
		System.out.println((char)0x12340041);
		
		//강제 형변환해서 데이터가 손실된 사례
		System.out.println((byte)(b+i));
		//b+i=227인데 1byte는 8bit이고 2의7승=128이고 여기서 -1해서 127까지 저장가능하다. 
		//127까지 저장가능한데 227을 저장하려고 해서 데이터 손실이 일어났다. 
		
		
		System.out.println((int)2.9+1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9+(int)1.8);
		
	}
	
}
