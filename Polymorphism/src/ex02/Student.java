package ex02;

public class Student extends Person{
	String grade;
	String department;
	
	// 부모에게 name이 있으므로 초기화는 부모 파일에서
	public Student(String name) {
		super(name);
	}

}
