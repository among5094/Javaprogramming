
public class DoWhileSample {
	
	public static void main(String[] args) {
		
		char a='\u326D';//㉭ //유니코드 0x326D  
		
		do {
			
			System.out.print(a);
			a=(char)(a-1);
			
			if(a<'\u3250' && a>'\u312D')
				break;
			
		}while(a>='\u312D'); //312D -> 

		
	}//main class닫기
}
