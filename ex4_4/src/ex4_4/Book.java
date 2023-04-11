package ex4_4;

public class Book {
	
	//필드 2개
	String title;
	String author; 
	
	//매개변수가 한 개인 생성자
	public Book(String t) { //생성자 이름은 class이름이랑 같음
		
		title = t;
		author="작자미상"; //초기값을 생성자에서 줌
	}
	//매개변수가 두 개인 생성자
	public Book(String t, String a) {
		
		title = t;
		author= a;
	}
	
	public static void main(String[] args) {
		
		//class Book의 레퍼런스(이름)이 littlePrince와 loveStory
		Book littlePrince = new Book("어린왕자", "생떽쥐베리");//
		Book loveStory = new Book();//"춘향전"
		
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
		//new Book(); 안에 
	}

}
