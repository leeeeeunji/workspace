package com.itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
			  학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드 호출
		  - 2명은 인자5개 생성자사용
		 */
		Student stu1 = new Student();
		stu1.setStudentData(1, "김가나", 80, 65, 72);
		
		Student stu2 = new Student(2, "김나영", 75, 90, 95);
		Student stu3 = new Student(3, "김다영", 50, 80, 60);
		
	
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		stu1.calculateTotal();
		stu2.calculateTotal();
		stu3.calculateTotal();
		
		stu1.calculateAvg();
		stu2.calculateAvg();
		stu3.calculateAvg();
		
		stu1.calculategrade();
		stu2.calculategrade();
		stu3.calculategrade();
		
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		stu1.headerPrint();
		stu1.print();
		stu2.print();
		stu3.print();
		
		
		/*
		 * 학생 student1 의 이름변경한후(이름변경메쏘드호출후) student1학생객체출력
		 * 학생 student1 의 총점데이타 반환받은 후 메인블록에서출력
		 * 학생 student1 의 학점데이타 반환받은 후 메인블록에서출력
		 */
		stu1.setName("김가영");
		stu1.headerPrint();
		stu1.print();
		
		System.out.println("학생 student1 의 총점 : " + stu1.getTot());
		System.out.println("학생 student1 의 학점 : " + stu1.getGrade());
		

	}

}
