package ex4_7;

import java.util.Scanner;

class Book{
	String title,author;
	
	//인자가 2개인 생성자
	public Book(String title, String author) {
		this.title=title; //필드의 title, 지역변수의 title
		this.author=author;
	}
	
}

public class BookArray {
	public static void main(String[] args) {
		Book book[]=new Book[2]; //Book 배열 선언
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<book.length; i++){
			
			System.out.print("제목>> ");
			String title=sc.nextLine();
			System.out.print("저자>> ");
			String author=sc.nextLine();
			book[i]=new Book(title, author);//배열 원소 객체 생성
		}	
			for(int j=0; j<book.length; j++)
				System.out.println("("+ book[j].title + "," + book[j].author+")");
			
			
		
		sc.close();
	}
}
