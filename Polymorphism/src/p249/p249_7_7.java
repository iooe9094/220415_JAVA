package p249;

public class p249_7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		
		// 업캐스팅 (자손에서 부모로)
		car = fe; // car = (Car)fe; 에서 형변환 생략
//		car.water(); -> Car 타입의 참조변수로는 water()를 호출할 수 없다.
		
		// 다운캐스팅 (부모에서 자손으로)
		fe2 = (FireEngine)car; // 자손타입 <- 조상타입. 형변환 생략 불가
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~"); // 운전 기능
	}
	
	void stop() {
		System.out.println("stop!!!"); // 멈추는 기능
	}
}

class FireEngine extends Car { // 소방차
	void water() { // 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}
