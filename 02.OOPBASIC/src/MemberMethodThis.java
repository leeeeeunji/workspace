
public class MemberMethodThis {
	/*
	 * 멤버필드[속성]
	 */
	int memberField1;
	char memberField2;
	double memberField3;
	/*
	 * 멤버메소드[기능]
	 */
	
	/*
	 * 1. 객체의 멤버필드에 데이타를 대입
	 */
	void setMemberField(int memberField1, char memberField2, double memberField3) {
		this.memberField1 = memberField1;
		this.memberField2 = memberField2;
		this.memberField3 = memberField3;
		
	}
	
	/*
	 * 2. 객체 멤버필드의 내용을 출력하는 메소드
	 */
	void print() {
		/*
		 * this : 
		 * 	- self 참조변수
		 * 	- void print()메소드가 실행될 때 호출되는 객체의 주소값
		 * 	- 생략 가능
		 */
		System.out.println("mmt.print()메소드 안에서 this의 값 : " + this);
		System.out.println(this.memberField1 + "\t" + 	
							this.memberField2 + "\t" + 	
							this.memberField3); 
		
	}

}
