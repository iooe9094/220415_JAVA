package ex01;

import java.util.ArrayList;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// <Integer>는 정수만 들어가게 강제하는 것
		ArrayList<Integer> arraylist = new ArrayList<>();
		
		// 추가
		arraylist.add(1);
		arraylist.add(2);
		arrayInfo(arraylist);
		
		// 인덱스 번호에 추가
		arraylist.add(1,10); // 인덱스 1에 값 10 추가
		arrayInfo(arraylist);
		
		// 삭제
		arraylist.remove(1);
		arrayInfo(arraylist);
	}

	public static void arrayInfo(ArrayList arraylist) {
		System.out.println("전체 값 : " + arraylist);
		System.out.println("1번 값 : " + arraylist.get(1));
		System.out.println("ArrayList 크기  : " + arraylist.size());
		System.out.println("-----------------");
    }
}
