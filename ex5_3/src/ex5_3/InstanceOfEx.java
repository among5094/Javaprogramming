package ex5_3;

//예제 5-3의 instance of를 이용해보기 위해 내용은 없는 class 4개 생성
class Person{ }
class Student extends Person {}
class Researcher extends Person {}
class Professor extends Researcher {}

public class InstanceOfEx {
	
	//static사용 이유: 객체가 생성되기 전부터 쓸 수 있으니까
	static void print(Person p)
	{
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Researcher)
			System.out.print("Professor ");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.print("new Student()-> "); print(new Student());
		System.out.print("new Researcher()-> "); print(new Researcher());
		System.out.print("new Professor()-> "); print(new Professor());
	}
}
