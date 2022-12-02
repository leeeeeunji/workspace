package com.itwill01.method;
/*
#### 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
*/
public class Student {
	/*
	 * << 속성(멤버변수)   >> 번호 이름 국어 영어 수학 총점 평균 평점 석차
	 * << 기능(멤버메쏘드) >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
	 */

	// 멤버변수 선언
	int num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	char gra;
	int rank = 1;
	
	// 멤버메쏘드 선언
			/*
			 * 기본데이타(번호,이름,국어,영어,수학)멤버변수에대입하는메쏘드
			 */
	void data(int num, String name, int kor, int eng, int math) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
			
			/*
			 * 총점계산메쏘드
			 */
	int total() {
		this.total = this.kor + this.eng + this.math;
		return total;
	}
			
			/*
			 * 평균계산메쏘드
			 */
	double avg() {
		this.avg = this.total / 3.0;
		return avg;
	}
			
			/*
			 * 평점계산메쏘드
			 */
	char gra() {
		switch((int)this.avg/10) {
		case 9:
			this.gra = 'A';
			break;
		case 8:
			this.gra = 'B';
			break;
		case 7:
			this.gra = 'C';
			break;
		case 6:
			this.gra = 'D';
			break;

		default:
			this.gra = 'F';
			break;
		}
		return gra;
	}
			
			/*
			 * 출력메쏘드
			 */
	void print1() {
		System.out.println("--------------------------------------------");
		System.out.println("번호 이름 국어 영어 수학 총점 평균 평점 석차");
		System.out.println("--------------------------------------------");
	}
	
	void print2() {
		System.out.printf("%2d %4s %d %4d %4d %4d %5.1f %3c %3d\n", 	
				this.num, this.name, this.kor, this.eng, this.math, 	
				this.total, this.avg, this.gra, this.rank);
	}
}
