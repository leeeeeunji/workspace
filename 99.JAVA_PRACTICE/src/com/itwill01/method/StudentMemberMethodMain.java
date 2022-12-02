package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();

		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		stu1.data(1,"김가영", 80, 90, 50);
		stu2.data(2,"김나영", 50, 70, 80);
		stu3.data(3,"김다영", 75, 90, 60);
		
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		stu1.total();
		stu2.total();
		stu3.total();
		
		stu1.avg();
		stu2.avg();
		stu3.avg();
		
		stu1.gra();
		stu2.gra();
		stu3.gra();
		
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		stu1.print1();
		stu1.print2();
		stu2.print2();
		stu3.print2();
		
	}

}
