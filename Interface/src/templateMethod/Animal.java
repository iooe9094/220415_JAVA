package templateMethod;

public abstract class Animal {
	// 추상 메소드
	abstract void play(); // "야옹~ 야옹~" , "멍! 멍!"
	
	// Overridng 메소드 추가하기
	// "야옹~ 야옹~ 꼬리 살랑살랑"
	// "멍! 멍! 꼬리 살랑살랑"
	void runSomething() {
		System.out.println("꼬리 살랑살랑~");
	}
	
	// 템플릿 메소드 - 고정값
	public void playWithOwner() {
		System.out.println("귀염둥이 이리온..."); // 첫 번째 행동 (부모에서 정의되어 자식 상관 없음)
		play(); // 두 번째 행동 (자식에 따라 다르게 변경되어 출력)
		runSomething(); // 세 번째 행동 (자식에 따라 다르게 변경되어 출력)
		System.out.println("잘했어"); // 네 번째 행동 (부모에서 정의되어 자식 상관 없음)
	}

}
