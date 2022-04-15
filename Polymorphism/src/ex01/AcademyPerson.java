package ex01;

public class AcademyPerson {
	private int num;
	private String name;
	
	// 기본 생성자
	public AcademyPerson() {
		
	}
	
	// 매개변수 2개 생성자
	public AcademyPerson(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public void display() {
		System.out.println("번호 = " + num);
		System.out.println("이름 = " + name);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
