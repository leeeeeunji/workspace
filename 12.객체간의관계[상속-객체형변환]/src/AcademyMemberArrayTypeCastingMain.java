
public class AcademyMemberArrayTypeCastingMain {

	public static void main(String[] args) {
		
		AcademyMember[] members = {
			new AcademyStudent(1, "KIM", "JAVA"),	
			new AcademyStudent(2, "LIM", "DESIGN"),	
			new AcademyStudent(3, "MIN", "ANDROID"),	
			new AcademyStudent(4, "OIM", "ANDROID"),	
			new AcademyGangsa(5, "PIM", "JAVA"),
			new AcademyGangsa(6, "QIM", "ACCOUNTING"),
			new AcademyStaff(7, "RIM", "MARKETING")
		};
		
		
		AcademyMember[] receiveMembers = members;
		
		System.out.println("--------AcademyMember전체 출력--------");
		for(int i = 0; i < receiveMembers.length; i++ ) {
			/*
			 * AcademyStudent, AcademyGangsa, AcademyStaff에서 재정의된 print 메소드 호출
			 */
			receiveMembers[i].print();
		}
		
		System.out.println("-------------instanceof-------------");
		/*
		 * 연산자 -> instanceof
		 * 		- 형태 : 참조변수 instanceof 클래스이름
		 * 		- 연산결과 : true or false
		 * 		- ex) boolean b = receiveMembers[0] instanseof AcademyStudent;
		 */
		AcademyMember am = new AcademyStudent(90, "김강사", "정보처리");
		if(am instanceof AcademyStudent) {    //am이 AcademyStudent의 수강생이면
			AcademyStudent tempStudent = (AcademyStudent)am;
			String tempBan = tempStudent.getBan();
			System.out.println("학생반 : " + tempBan);
		}
		
		System.out.println("---AcademyMember배열에 있는 객체들 중 AcademyStudent만 출력---");
		for( int i = 0; i < receiveMembers.length; i++) {
			if(receiveMembers[i] instanceof AcademyStudent) {
				receiveMembers[i].print();
				AcademyStudent tempStudent = (AcademyStudent)receiveMembers[i];
				System.out.println("학생반 : " + tempStudent.getBan());
			}
		}
		
		
		
		
		
	}

}
