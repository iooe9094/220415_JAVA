package ex03;

public class InterfaceTest {

	public static void main(String[] args) {
		
		System.out.println(PhoneInterface.TIMEOUT);
		
		PhoneMP3 inter = new PhoneMP3();
		inter.sendcall();
		inter.receiveCall();
		inter.sendSMS();
		inter.receiveSMS();
	}
}
