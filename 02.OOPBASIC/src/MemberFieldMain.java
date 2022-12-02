
public class MemberFieldMain {

	public static void main(String[] args) {
		System.out.println("-------main start-------");
		/*
		 * MemberField 사용자 정의 타입 객체의 주소값을 저장할 변수 선언(=참조변수)
		 */
		MemberField mf1;//=>변수 선언. MemberField=타입. mf1=식별자
		/*
		 * MemberFeild클래스(틀)로 객체 생성 후, 객체의 참조변수 mf1에 생성된 객체의 주소값 대입(#100)
		 */
		mf1 = new MemberField();
		
		/*
		 * mf1(#100)주소에 있는 객체의 int		타입 멤버변수 member1에 77		값 대입 
		 * mf1(#100)주소에 있는 객체의 double	타입 멤버변수 member2에 3.14159	값 대입 
		 * mf1(#100)주소에 있는 객체의 char		타입 멤버변수 member3에 'A' 	값 대입 
		 * mf1(#100)주소에 있는 객체의  String	타입 멤버변수 member4에 "김수한무거북이~~" 값 대입 
		 * 
		 * 객체의 참조(주소)변수가 가지고 있는 객체의 주소값(=#100)을 사용해서 멤버필드에 데이타 대입
		 * 객체의 멤버필드 접근 방법
		 * 	- 참조(주소)변수.멤버필드의 이름 = 값;
		 * 	- ex) mf1.member1 = 77;
		 */
		mf1.member1 = 77;
		mf1.member2 = 3.14159;
		mf1.member3 = 'A';
		mf1.member4 = "김수한무거북이~~";
		
		/*
		 * mf1 객체의 int		타입 멤버변수 member1의 값을 출력
		 * mf1 객체의 double	타입 멤버변수 member2의 값을 출력
		 * mf1 객체의 char		타입 멤버변수 member3의 값을 출력
		 * mf1 객체의 String	타입 멤버변수 member4의 값을 출력
		 * 
		 * 객체의 참조(주소)변수가 가지고 있는 객체의 주소값(=#100)을 사용해서 멤버필드의 값 출력
		 * 객체의 멤버필드 접근 방법
		 * 	1. System.out.println(mf1.member1);
		 * 	2. int tempMember1 = mf1.member1;
		 *     System.out.println(tempMember1);
		 * 
		 */
		System.out.println(mf1.member1);//멤버변수는 파란색으로 표시 됨
		System.out.println(mf1.member2);//mf1만 입력하면 헥사코드로 출력됨(MemberField@15db9742)
		System.out.println(mf1.member3);
		System.out.println(mf1.member4);
		
		
		
		MemberField mf2 = new MemberField();
		
		mf2.member1 = 88;
		mf2.member2 = 1.142145;
		mf2.member3 = 'F';
		mf2.member4 = "제임스딘";
		
		System.out.println(mf2.member1);
		System.out.println(mf2.member2);
		System.out.println(mf2.member3);
		System.out.println(mf2.member4);
		
		
		System.out.println("--------main end--------");

	}

}
