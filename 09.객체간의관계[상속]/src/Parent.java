/*
 * 상속(클래스의 관계):
 * 	부모클래스(객체)의 멤버들을 자식클래스(객체)가 물려받는것
 * 
 *  1. 상속을 사용하는이유--> 기존에 만들어놓은 클래스의 재사용,
 * 						 확장을 위해 사용한다.
 *  2. 자바에서는 단일상속만 가능하다(부모클래스가 한개만 가능) 
 *  3. 부모클래스(super, 상위)와 자식클래스(sub, 하위, 파생)가 존재한다.
 *  4. 자바에서 제공되어지는 모든 클래스들은 Object 라고 하는
 *     최상위 클래스로부터 상속되어진다.
 *  5. 사용자정의 클래스들도 Object 클래스라는 최상위클래스를
 *     상속 받아야 한다. 
 * 
 */

public class Parent {
	public int member1;
	public int member2;
	public void method1() {
		System.out.println("Parnet.method1()");
	}
	public void method2() {
		System.out.println("Parnet.method2()");
	}
}
