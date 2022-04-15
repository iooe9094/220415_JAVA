package ex02;

public class Driver {

	public static void main(String[] args) {
		// interface의 전역 상수를 불러올 수 있다
		System.out.println(Speakable.PI);
		System.out.println(Speakable.zeroPoint);
		
		// interface를 구현한 메소드를 호출
		Specker reporter = new Specker();
		reporter.sayYes();
	}

}
