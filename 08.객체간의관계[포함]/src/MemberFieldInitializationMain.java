
public class MemberFieldInitializationMain {

	public static void main(String[] args) {
		MemberField mf1 = new MemberField();
		System.out.println("1-1. 인스턴스 멤버필드는 객체 생성 시 기본값으로 자동 초기화됨");
		System.out.println(mf1.member1);
		System.out.println(mf1.member2);
		System.out.println(mf1.member3);
		System.out.println(mf1.member4);
		System.out.println(mf1.member5);
		System.out.println(mf1.member6);
		System.out.println("1-2. 인스턴스 멤버필드는 선언 시 초기값으로 초기화 할 수 있다");
		System.out.println(mf1.member11);
		System.out.println(mf1.member22);
		System.out.println(mf1.member33);
		System.out.println(mf1.member44);
		System.out.println(mf1.member55);
		System.out.println(mf1.member66);
		
		DuoMember paraMember = new DuoMember(1, "일번님");
		MemberField mf2 = new MemberField(333, 3.2, '가', true, "김경호", paraMember);
		
	}

}
