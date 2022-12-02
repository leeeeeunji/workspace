package lang;

public class StringCompareMain {

	public static void main(String[] args) {
		/*
		 * String 객체의 생성
		 * 	1. 생성자 호출(명시적 생성)
		 * 	2. ""로 생성(암시적 생성)
		 */
		String name1 = new String("KIM");
		String name2 = new String("KIM");
		String name3 = "KIM";
		String name4 = "KIM";
		
		
		
		System.out.println("---------String객체 내용 비교는 equals메소드를 사용하여야 합니다.-----------");
		/*
		 * <<public boolean equals(String otherString)>>
		 */
		if(name1.equals(name2)) {
			System.out.println("name1객체의 문자열과 name2객체의 문자열이 동일하다");
		}
		if(name1.equals(name3)) {
			System.out.println("name1객체의 문자열과 name3객체의 문자열이 동일하다");
		}
		if(name3.equals(name4)) {
			System.out.println("name3객체의 문자열과 name4객체의 문자열이 동일하다");
		}
		if(name1.equals("KIM")) {
			System.out.println("name3객체의 문자열과 \"KIM\" 객체의 문자열이 동일하다");
		}
		if("KIM".equals("KIM")) {
			System.out.println("\"KIM\"객체의 문자열과 \"KIM\" 객체의 문자열이 동일하다");
		}
		
		
		/*
		public int compareTo(String anotherString)
			- (앞쪽 문자열 유니코드 숫자 - 뒷쪽 문자열 유니코드 숫자)의 결과 반환
		 */
		
		int uniCodeGap = "aaa".compareTo("aaa");
		System.out.println(uniCodeGap);
		uniCodeGap = "aaa".compareTo("aab");
		System.out.println(uniCodeGap);
		uniCodeGap = "aab".compareTo("aaa");
		System.out.println(uniCodeGap);
		String irum1 = "aaa";
		String irum2 = "aab";
		
		if(irum1.compareTo(irum2) > 0) {
			System.out.println("irum1,irum2 교환[오름차순]");
		}
		
		
	}

}
