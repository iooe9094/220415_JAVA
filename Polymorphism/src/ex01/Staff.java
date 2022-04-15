package ex01;

public class Staff extends AcademyPerson {
	
	private String department; // 부서

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(int num, String name, String department) {
		super(num, name);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void display() {
		System.out.println("직원번호 = " + getNum());
		System.out.println("직원이름 = " + getName());
		System.out.println("부서 = " + department);
	}
}
