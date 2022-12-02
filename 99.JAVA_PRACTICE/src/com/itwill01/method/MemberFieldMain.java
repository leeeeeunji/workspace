package com.itwill01.method;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		MemberField mf = new MemberField();
		
		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		mf.memberField1 = 1;
		mf.memberField2 = "안녕";
		mf.memberField3 = 'A';
		mf.memberfield4 = 10.55;
		
		
		
		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		
		System.out.println(mf.memberField1);
		System.out.println(mf.memberField2);
		System.out.println(mf.memberField3);
		System.out.println(mf.memberfield4);
		

	}

}
