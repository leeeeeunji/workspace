
public class MemberMethodReturn {
	/*
	 * 멤버필드
	 * 	- 멤버필드 선언 시, 값을 대입할 수 있다.(하지만 대부분 고정값을 쓰진 않아서 대입 자주 안 함)
	 */
	int memberField1 = 0;
	int memberField2 = 0;
	int memberField3 = 0;
	
	/*
	 * setter method
	 */
	void setMemberField1(int memberField1) {
		this.memberField1 = memberField1;
	}
	
	void setMemberField2(int memberField2) {
		this.memberField2 = memberField2;
	}
	
	void setMemberField3(int memberField3) {
		this.memberField3 = memberField3;
	}
	
	
	/*
	 * getter method
	 */
	int getMemberField1() {
		return memberField1;
	}
	
	int getMemberField2() {
		return memberField2;
	}
	
	int getMemberField3() {
		return memberField3;
	}
	
	


	/*
	 * 멤버메소드
	 */
	int method1() {
		System.out.println("\t---int method1()실행---");
		int result = 1 + 2;
		System.out.println("\t---int method1()실행 종료 후 int 데이타 반환---");
		/*
		 * return <<호출한 클래스(or 객체)에게 반환할 값(->변수, 리터럴, 연산의 결과)>>;
		 * 	- 호출한 곳으로 실행흐름 반환
		 * 	- 호출한 곳으로 데이타 반환
		 *	- 반환할 데이타가 없는 경우, (void) return문 생략 가능
		 *	- 반환할 데이타가 있는 경우, int..등등 return문 반드시 입력
		 */
		return result;
	}
	
	boolean method2() {
		System.out.println("\t---boolean method2()실행---");
		boolean isMarried = false;
		System.out.println("\t---boolean method2()실행 종료 후 boolean 데이타 반환---");
		return isMarried;
	}
	
	/*
	 * 두 개의 정수를 파라메타(매개변수)로 받아서 더한 결과를 반환하는 메소드
	 */
	int add(int a, int b) {
		System.out.println("\t------int add(int a, int b)실행-----");
		int result = a + b;
		System.out.println("\t------int add(int a, int b)실행 종료 후 int 데이타 반환-----");
		return result;
	}
	/*
	 * 이름을 매개변수로 입력 받고 인사말을 만들어 문자열로 반환
	 */
	
	String hello(String name) {
		System.out.println("\t------String hello(String name)실행-----");
		String msg = "";
		msg = name + "님 안녕하세요!";
		System.out.println();
		System.out.println("\t------String hello(String name)실행 종료 후 String(문자열)데이타 반환-----");
		return msg;
	}
}





