/*
 * 클래스의 구성요소
 * 	1. 멤버필드(변수)[속성] : 객체 생성 시 속성데이타를 저장
 * 	2. 멤버메소드
 */
public class MemberMethod {

	void method1() {
		System.out.println("\t-----void method()실행 시작-----");
		System.out.println("\t method1 stmt1");
		System.out.println("\t method1 stmt2");
		System.out.println("\t-----void method()실행 끝-------");
		/*
		 *  <<return>>
		 - 모든 메쏘드블록의 마지막에는 항상 실행흐름을 <호출한 곳으로 반환>하여야 한다.
		 - 실행흐름을 반환하는 문장이 return문이다.
		 - return 문을 만나면 실행흐름이 호출한 곳으로 반환된다.
		 - return type이 void 인 경우에는 생략 가능
		 - return문이 생략된 경우, 컴파일러가 자동으로 return문을 삽입하여 준다.
		 */
		return;
	}
	void method2() {
		System.out.println("\t----void method2()----실행");
		System.out.println("\t----method2() stmt1");
		System.out.println("\t----method2() stmt2");
		System.out.println("\t----void method2()----실행종료");
		return;
	}
	/***********매개변수가 있는 메소드 정의***********/
	void method3(int count) {
		System.out.println("\t------void method3(int count)-----실행");
		int localVar = 111;
		System.out.println("\t method3 메소드블록 안에서 선언된 로컬변수 : "+localVar);
		for(int i = 0; i < count; i++) {
			System.out.println("\t viod method3(int count)실행 : 파라메타(매개변수) count값 -> "+count);
		}
		System.out.println("\t------void method3(int count)-----실행종료 후 반환");
		return;
	}
	public void method4(String msg, int count) {
		System.out.println("\t void method4(String msg, int count)---실행");
		for(int i = 0; i < count; i++) {
			System.out.println(msg);
		}
		System.out.println("\t void method4(String msg, int count)---실행 종료");
		return;
	}
	public void method5(String name, String msg, int count) {
		System.out.println("\t void method5(String name, String msg, int count)---실행");
		for(int i = 0; i < count; i++) {
			System.out.printf("\t%s 님 %s\n",name,msg);
		}
		System.out.println("\t void method5(String name, String msg, int count)---실행 종료");
		
	}
}
