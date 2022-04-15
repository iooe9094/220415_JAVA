package ex05;

public class DBTest {

	public static void main(String[] args) {
		
	    // Command + SHIFT + y = 전체 소문자로 변경
		// Command + SHIFT + x = 전체 대문자로 변경
		
		DBInterface dbs = new DBInterface();
		
		dbs.connect();
		dbs.disconnect();
		dbs.work();
	}

}
