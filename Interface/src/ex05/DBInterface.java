package ex05;

public class DBInterface implements DBAccess {

	@Override
	public void connect() {
		System.out.println("DB 출력");
	}

	@Override
	public void disconnect() {
		System.out.println("DB 연결해제");
	}

	@Override
	public void work() {
		System.out.println("실행");
	}

}
