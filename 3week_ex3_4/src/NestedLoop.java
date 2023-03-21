
public class NestedLoop {
	
	public static void main(String[] args) {
		
		System.out.println("구구단을 외자~");
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				
				System.out.print(i+"*"+j+"=" + i*j);
				System.out.print('\t');//탭으로 밀기
			}
			System.out.println(); //다음줄로 
		}
	}

}
