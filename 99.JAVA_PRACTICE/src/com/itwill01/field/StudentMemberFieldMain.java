package com.itwill01.field;

public class StudentMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 2명생성
		 */
		Student stu1, stu2;
		
		stu1 = new Student();
		stu2 = new Student();
		
		/*
		 * 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		stu1.num = 1;
		stu1.name = "김경호";
		stu1.kor = 60;
		stu1.eng = 70;
		stu1.math = 80;
		
		stu2.num = 2;
		stu2.name = "김경수";
		stu2.kor = 80;
		stu2.eng = 50;
		stu2.math = 90;
		
		/*
		 * 학생의 기본 데이타를 사용해서 총점,평균,평점 계산후 대입(2명)
		 */
		
		stu1.score = stu1.kor+stu1.eng+stu1.math;
		stu2.score = stu2.kor+stu2.eng+stu2.math;
		
		stu1.avg = stu1.score/3.0;
		stu2.avg = stu2.score/3.0;
		
		
		char gra1 = 'X';
		switch ((int)stu1.avg/10) {
		case 9:
			stu1.gra = 'A';
			break;
		case 8:
			stu1.gra = 'B';
			break;
		case 7:
			stu1.gra = 'C';
			break;
		case 6:
			stu1.gra = 'D';
			break;
			
		default:
			stu1.gra = 'F';
			break;
		}
		
		
		char gra2 = 'Z';
		switch ((int)stu2.avg/10) {
		case 9:
			stu2.gra = 'A';
			break;
		case 8:
			stu2.gra = 'B';
			break;
		case 7:
			stu2.gra = 'C';
			break;
		case 6:
			stu2.gra = 'D';
			break;
			
		default:
			stu2.gra = 'F';
			break;
		}
		
		
		
		
		
		/*
		 * 학생 데이타를 출력 2명
		 */
		/*
		- 출력포맷
		- 평균은 소수점이하 첫째자리까지출력(반올림)
		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		
		System.out.printf("--------------학생 성적출력-------------------\n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n","학번","이름","국어", "영어","수학","총점","평균","평점","석차");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n",stu1.num,stu1.name,stu1.kor,stu1.eng,stu1.math,stu1.score,stu1.avg,stu1.gra,0);
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n",stu2.num,stu2.name,stu2.kor,stu2.eng,stu2.math,stu2.score,stu2.avg,stu2.gra,0);
		System.out.printf("-----------------------------------------------\n");
	}

}