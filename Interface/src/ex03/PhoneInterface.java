package ex03;

public interface PhoneInterface {

	// 전역 상수
	final int TIMEOUT = 10000;
	
	// 추상 메소드
	void sendcall(); // "따르릉"
	void receiveCall(); // "전화 왔어요"
}
