/*
오버로딩(다중정의)
  1. 자바 다형성구현기법 중의 하나이다.
  2. 정의: 같은 메쏘드 이름으로 여러개를 정의하는 방법
           - 규칙: 
               * 메쏘드의 이름이 같아야 한다.
               * 메쏘드의 인자의 숫자 또는 타입이 달라야 한다.
               * 메쏘드의 리턴 타입, 접근 지정자는 상관 없다.

*/
public class OverLoading {
	public void method() {
		System.out.println("public void method");
	}
	public void method(int a) {
		System.out.println("public void method(int a)");
	}
	public void method(String a) {
		System.out.println("public void method(String a)");
	}
	public void method(int a, int b) {
		System.out.println("public void method(int a, int b)");
	}
	public void method(int a, String b) {
		System.out.println("public void method(int a, int b)");
	}
	public void method(int a, int b, int c) {
		System.out.println("public void method(int a, int b)");
	}
	public void method(String a, int b, int c) {
		System.out.println("public void method(int a, int b)");
	}
	/*
	 * <<메소드의 리턴 타입, 접근 지정자는 상관 없다>>
	public int method(String a, int b, int c) {
		System.out.println("public void method(int a, int b)");
	}
	*/
}
