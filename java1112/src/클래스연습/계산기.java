package 클래스연습;

public class 계산기 {
//		계산기=>class
//		프로그램하려고 하는 대상은 2가지 특징을 가지고 있음
//		1) 눈에 보이는 속성: 색, 가격, 크기 
//		=> 멤버변수(전역변수, global변수, 클래스 전체영역에서 사용 가능)
//		=> 자동 초기화
	String color;// 참조형(null)로 초기화
	int price;// 기본형(0)으로 초기화
	int size; // 기본형(0)으로 초기화

//		2)동작: 더하다, 빼다, 곱하다, 나누다
//		=> 멤버메서드(입력값, 반환값 유무)

	public int 더하다(int c1, int c2) { // 메서드(기능) 정의
		// 매개변수(parameter)
		// void: 없다. 반환값이 없다.
		int result = c1 + c2;
		return result;

	}

	public int 빼다(int m1, int m2) {
		int result = m1 - m2;
		return result;
	}

	public int 곱하다(int a1, int a2) {
		int result = a1 * a2;
		return result;

	}

	public void 나누다() {

	}

}
