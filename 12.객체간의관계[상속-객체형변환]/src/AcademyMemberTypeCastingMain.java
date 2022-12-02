
public class AcademyMemberTypeCastingMain {

	public static void main(String[] args) {
		/*
		 * AcademyStudent extends AcademyMember {}
		 * AcademyGangsa extends AcademyMember {}
		 * AcademyStaff extends AcademyMember {}
		 * 
		 * AcademyMember의 자식타입객체(AcademyStudent, AcademyGangsa, AcademyStaff)들은
		 * AcademyMember타입 변수에 대입 가능
		 */
		
		AcademyStudent st1 = new AcademyStudent(1, "KIM", "ANDROID");
		AcademyMember m1 = st1;
		AcademyMember m2 = new AcademyStudent(2, "LEE", "JAVA");
		AcademyMember m3 = new AcademyStudent(3, "JIN", "OFFICE");
		
		AcademyMember m4 = new AcademyGangsa(4, "박강사", "보안");
		AcademyMember m5 = new AcademyGangsa(5, "정강사", "빅데이터");
		
		AcademyMember m6 = new AcademyStaff(6, "천상용", "회계팀");
		AcademyMember m7 = new AcademyStaff(7, "박승곤", "원장");
		
		/********AcademyMember에 정의되지 않은 메소드 호출 불가능*********
		String ban = m1.getBan();
		*****************************************************************/
		
		/***AcademyMember에 정의된 메소드 중 재정의된 메소드 호출 가능***
		 	- AcademyMember타입에 정의된 print메소드를 호출 시,
			AcademyMember의 자식타입객체(AcademyStudent, AcademyGangsa, AcademyStaff)의
		 	재정의된 print메소드가 호출 됨
		 */
		m1.print();
		System.out.println("----------AcademyMember들 전체출력----------");
		m1.print();
		m2.print();
		m3.print();
		m4.print();
		m5.print();
		m6.print();
		m7.print();
		
		
		
		

	}

}
