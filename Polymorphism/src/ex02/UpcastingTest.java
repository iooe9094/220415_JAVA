package ex02;

public class UpcastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Person p;
		Student s = new Student("이재문");
		
		p = s; // 업캐스팅 (부모로 형변환) 다형성
		
		
		
		
//	    System.out.println("--------------");
//		Person p = new Student("이재문"); // 껍데기는 부모, 알맹이는 자식
//		Student s;
		
//	    s = (Student)p; // 다운캐스팅 (자식으로 형변환) 다형성
		
		System.out.println(p.name);
//		System.out.println(s.name);
//		p.department = "A";
	}
}
