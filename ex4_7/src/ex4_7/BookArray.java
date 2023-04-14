

import java.util.Scanner;
package ex4_7;
class Book{
	String title,author;
	public Book(String title, String author) {//생성자
		this.title=title; //필드의 title, 지역변수의 title
		this.author=author;
	}
	
}

public class BookArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book book[]=new Book[2]; //Book 배열 선언
		
		for(int i=0; i<book.length; i++)
		{
			System.out.print("제목>> ");
			String title=sc.nextLine();
			System.out.print("저자>> ");
			String author=sc.nextLine();
			book[i]=new Book(title, author);//배열 원소 객체 생성
			
			for(int j=0; j<book.length; j++)
				System.out.println("("+ book[j].title + "," + book[j].author+")");
			
			
		}
		sc.close();
	}
}
