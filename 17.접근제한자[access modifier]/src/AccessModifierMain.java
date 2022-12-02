/*
 * 클래스의 접근을 제한하는 제한자
 * 		   1. 클래스의 접근제한
 * 			    A. public 	: 외부 모든 클래스(객체)에서 접근 가능
 * 			    C.(default)	: 같은 패키지에 있는 클래스(객체)에서 접근 가능	
 * 							  다른 패키지에 있는 클래스(객체)에서 접근 불가능					
 * 
 *      2. 클래스의 멤버(필드,메쏘드,생성자)의 접근 제한
 *      3. 접근제한자(public,protected,(default),private) 
 *      		A.public    : 외부 모든 클래스(객체)에서 접근 가능
 *     	    	B.protected : 같은 패키지에 있는 모든 클래스(객체) 에서 접근 가능
 *                        	  다른 패키지에 있는 모든 클래스(객체) 에서 접근 불가능
 *                        	  다른 패키지에 있는 상속관계에 있는 자식클래스에서 접근 가능
 
 *          	C.(default) : 같은 패키지에 있는 모든클래스(객체) 에서 접근 가능
 *          			 	  다른 패키지에 있는 모든클래스(객체) 에서 접근 불가능
 * 			    D.private   : 외부 모든 클래스(객체)에서 접근 불가능
 */
public class AccessModifierMain {

	public static void main(String[] args) {
		/*
		자바에서 제공되는 패키지 이름과 동일한 패키지는 만들 수 없음
		Prohibited package name: java.lang
		
		MyString myString = new MyString();
		System.out.println(myString);
		*/
		
		/*
		 * protectd로 선언된 멤버는 상속받은 후 클래스를 생성하여 사용 가능
		 */

	}

}
