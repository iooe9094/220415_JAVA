package ex01;

public class Student extends AcademyPerson {
	
    public String course;

	public Student() {
	}

	// num, name : 부모 쪽에서 초기화
	// course : 자식쪽에서 초기화
	public Student(int num, String name, String course) {
		super(num, name);
		this.course = course; // 매개변수 course 추가되어서
	}
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override 
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("학생번호 = " + getNum());
		System.out.println("학생이름 = " + getName());
		System.out.println("과정 = " + course);
	}
}
