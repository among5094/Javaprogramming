package ex4_8;

public class ArrayParameter {
	
	static void replaceSpace(char a[]){
		//공백에 ,를 넣어주는 for문
		for(int i=0; i<a.length; i++)
			if(a[i]==' ')
				a[i]=',';

		
	}//
	
	static void printCharArray(char a[]){
		
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]);
			
		System.out.println();
		
		
	}//
	public static void main(String args[]) {
		//char c[]= {'T','i','s','h',' ','i','s',' ',};
		String str="This is a pencil";
		char c[]=new char[str.length()];
		for(int i=0; i<str.length(); i++)
			c[i]=str.charAt(i);
		
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}
	
}//class닫기
