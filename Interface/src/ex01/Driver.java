package ex01;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		동물[] 동물들 = new 동물[5];
		
		동물들[0] = new 쥐();
		동물들[1] = new 고양이();
		동물들[2] = new 강아지();
		동물들[3] = new 송아지();
		동물들[4] = new 병아리();
		
		for(int i=0; i<동물들.length; i++) {
			// 쥐 print 출력 메세지 : "나는 쥐! 찍찍" 순으로
			동물들[i].물어보세요();
		}
	}

}
