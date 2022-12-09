
public class OuterClass {
	/*
	 * 인스턴스 멤버필드
	 */
	public int outer_member_field = 99;
	
	/*
	 * 인스턴스 멤버메소드
	 */
	public void outer_member_method() {
		System.out.println("OuterClass.member_method()");
	}
	/*****************OuterClass에서 InnerClass객체 생성, 사용**********************/
	public void outer_inner_class_use() {
		OuterClass.InnerClass ic = new OuterClass.InnerClass(); //굳~이 자세하게 쓰자면 이렇게 씀
		ic.inner_member_field = 121212;
		ic.inner_member_method();
		System.out.println(ic.inner_member_field);
	}
	
	
	
	
	/*
	 * 인스턴스 멤버클래스(nested class, inner class)
	 * 	- 작성 이유 : 내부클래스에서 외부클래스의 멤버접근을 손쉽게 하기 위해.
	 */
	public class InnerClass {
		public int inner_member_field = 3333;
		public void inner_member_method() {
			System.out.println("InnerClass.inner_member_method()");
		}
		
		/****************내부클래스에서 외부클래스의 멤버 접근*******************/
	
		public void inner_outer_member_access() {
			System.out.println(InnerClass.this); //그냥 this만 적으면 외부클래스인지,내부클래스인지 구분을 못 함
			System.out.println(OuterClass.this);
			System.out.println(this);//InnerClass 객체 참조
			outer_member_field = 9999;
			outer_member_method();
		}
		
	}
	
	
}
