package ex03;

public class PhoneMP3 implements MP3Interface, PhoneInterface {

	@Override
	public void sendcall() {
		System.out.println("따르릉");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자 갑니다");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자 왔어요");
	}
}
