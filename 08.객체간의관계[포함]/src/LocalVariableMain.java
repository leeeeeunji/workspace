
public class LocalVariableMain {

	public static void main(String[] args) {
		/*
		 * 지역변수(local Variable)
		 * 		- 메소드 블록 안에서 선언된 변수(매개변수 포함)
		 * 멤버변수(필드)
		 * 		- 클래스 블록 안에서 선언된 변수
		 */
		/*
		 * local변수(기본형 변수-> 초기화를 꼭 해야 함)
		 */
		int a = 9;
		int b = 10;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		/*
		 * local 변수 초기화
		 * 		- 모든 변수는 반드시 초기화하여야 사용할 수 있다.(멤버변수는 자동으로 초기화 됨)
		 */
		/**************************************************
		int tot;
		//System.out.println(tot);
		=> 1. <<The local variable tot may not have been initialized>>
		**************************************************/
		
		/**************************************************
		int tot;
		boolean condition = true;
		if(condition) {
			tot = 0;
		}
		System.out.println("tot = " + tot);
		=> 2. <<The local variable tot may not have been initialized>>
		**************************************************/
		
		/**************************************************
		int tot;
		tot = tot+1;
		=> 3. <<The local variable tot may not have been initialized>>
		**************************************************/
		
		int tot1 = 0;
		System.out.println("tot1 = " + tot1);
		
		int tot2;
		tot2 = 0;
		boolean condition = true;
		if(condition) {
			tot2 = 2;
		}
		System.out.println("tot2 = " + tot2);
		
		int tot3;
		tot3 = 0;
		tot3 = tot3 + 3;
		System.out.println("tot3 = " + tot3);
		
		
		
		/*
		 * local변수(참조형 변수 ->자동 초기화 안 됨)
		 */
		/**************************************************
		DuoMember member1;
		member1.print();
		
		<<The local variable member1 may not have been initialized>>
		**************************************************/
		
		DuoMember member1 = new DuoMember(1, "김경호");
		member1.print();
		
		DuoMember member2;
		boolean condition2 = true;
		if(condition2) {
			member2 = new DuoMember(20, "김은희"); 
		}else {
			member2 = new DuoMember(20, "김수미");
		}
		member2.print();
		
		
		/*
		 * 참조변수 초기화 시 기본값
		 * 			- null(참조변수 리터럴) = 주소가 없다는 주소값
		 */
		DuoMember member3 = null;
		if(member3 == null) {
			member3 = new DuoMember(3, "김삼돌");
		}
		member3.print();
		
		
		
		return;
	}

}
