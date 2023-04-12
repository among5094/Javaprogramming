package ex4_5;

public class Book {
	String title; //필드
	String author; //필드 
	void show() { //메소드
		System.out.println("제목: "+ title + ", 작가:" + author);
	}
	
	//매개변수가 없는 생성자
	public Book() {
		this("", ""); //this()는 생성자의 가장 위에 써줘야한다.
		System.out.println("매개변수가 없는 생성자");
	}
	
	//매개변수가 1개인 생성자
	public Book(String title) {
		this(title,"작자 미상");
		System.out.println("매개변수가 한 개인 생성자");
	}
	
	//매개변수가 2개인 생성자
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
		System.out.println("매개변수가 두 개인 생성자");
	}
	
	//main method
	public static void main(String[] args) {
		
		Book emptyBook=new Book(); //class Book의 레퍼런스(이름)이 emptyBook이고, 매개변수가 없는 생성자를 불러옴
		Book bible = new Book("춘향전");//class Book의 레퍼런스(이름)이 bible이고, 매개변수가 1개인 생성자를 불러옴
		Book javaBook = new Book("어린왕자", "생떽쥐베리");//class Book의 레퍼런스(이름)이 javabook이고, 매개변수가 2개인 생성자를 불러옴
		
		//출력
		System.out.println(".show()출력 3개 >> ");
		javaBook.show();
		bible.show();
		emptyBook.show();
		
	}//main method 종료
}//class 종료
