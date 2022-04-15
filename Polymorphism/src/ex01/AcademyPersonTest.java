package ex01;

public class AcademyPersonTest {
	
	// 다형성 : 부모 자식 모두 매개변수로 사용 가능
	public static void process(AcademyPerson arr) {
    	if(arr instanceof Teacher) {
    		// 자식 객체의 메소드 호출을 위해서는 형 변환이 필요
    		Teacher teacher = (Teacher)arr;
    		System.out.println(teacher.getSubject() + "의 강사정보 >>");
    	}
    	else if(arr instanceof Student) {
    		Student student = (Student)arr;
    	    System.out.println(student.getCourse() + "의 학생정보 >>");
    	}
    	else {
    		Staff staff = (Staff)arr;
    		System.out.println(staff.getDepartment() + "의 직원정보 >>");
    	}
    	// 오버라이딩 된 메소드 : 형변환 필요 없음
    	arr.display();
    	System.out.println("---------------");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    AcademyPerson[] personArray = new AcademyPerson[5];
	    
	    personArray[0] = new Student(1000, "홍길동", "Java반");
	    personArray[1] = new Teacher(2000, "임꺽정", "Java반");
	    personArray[2] = new Staff(3000, "전우치", "관리부");
	    personArray[3] = new Student(4000, "일지매", "Oracle반");
	    personArray[4] = new Staff(5000, "장길산", "영업부");
	    
	    // 1번 해결
	    process(personArray[0]);
	    process(personArray[1]);
	    process(personArray[2]);
	    process(personArray[3]);
	    process(personArray[4]);
	    
	    // 2번 해결
//	    for(AcademyPerson b : personArray) {
//	    	process(b);
//	    }
	}
}
