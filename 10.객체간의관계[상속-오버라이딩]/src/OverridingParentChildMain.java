/*
 * 오버라이딩(재정의)
 *   1. 상속관계에서 발생하는 메쏘드의 재정의(자식에서 일어남) 기법이다
 *   2. 자바의 다형성 기법중의 하나이다.
 *   
 *   -형태 : 부모클래스에,정의된 메쏘드의 이름,리턴타입,인자가
 *          동일한 메쏘드를 자식클래스에 정의(재정의)하는 것
 * 
 *   - ex> public class Super{
 *   			public void print(){
 *   			}		
 *   		}
 *        
 *        public class Sub extends Super{
 *        		public void print(){
 *        		}
 *        }
 * 
 */

class OverridingParent {
	public void method1() {
		System.out.println("OverridingParent.method1()");
	}
	public void method2() {
		System.out.println("OverridingParent.method2()");
	}
}

class OverridingChild extends OverridingParent {
	/*
	public void method1() {
		System.out.println("OverridingParent.method1()");
	}
	<<부모로부터 상속받은 자식메소드 method2>>
	-	숨겨진다. (외부에서 호출 불가)
	public void method2() {
		System.out.println("OverridingParent.method2()");
	}
	 */
	/*
	<<자식에서 재정의한 자식메소드 method2>>
	-	자식에서 재정의한 메소드만 호출됨
	 */
	@Override //컴파일 시, 컴파일러가 재정의 여부를 확인할 수 있도록 하는 표시
	public void method2() {
		System.out.println("--------재정의된 method2 start---------");
		/*
		 * super
		 * 	- this와 같은 self참조변수
		 * 	- this와 같은 주소값
		 * 	- 재정의에 의해 숨겨진(은폐된) 메소드(멤버) 호출 시 사용
		 */
		super.method2();
		System.out.println("OverridingChild.method2() 추가작업");
		System.out.println("---------재정의된 method2 end----------");
	}
	public void method3() {
		System.out.println("OverridingChild.method3()");
	}
}




public class OverridingParentChildMain {

	public static void main(String[] args) {
		OverridingChild oc = new OverridingChild();
		oc.method1();
		/*
		 * oc.method2(); 호출 시, 자식에서 재정의된 메소드가 호출됨
		 */
		oc.method2();
		oc.method3();

	}

}
