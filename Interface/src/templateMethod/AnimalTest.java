package templateMethod;

public class AnimalTest {

	public static void main(String[] args) {
		// 고양이, 강아지 클래스 만들기
		Animal bolt = new dog(); // 다형성 -> Animal(부모)에 new Dog(자식)을 밀어 넣어 객체 생성
		Animal kitty = new cat();
		
		bolt.playWithOwner();
		
		System.out.println("--------------------");
		
		kitty.playWithOwner();
	}

}
