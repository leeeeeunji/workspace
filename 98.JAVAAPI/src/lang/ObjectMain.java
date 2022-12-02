package lang;

public class ObjectMain {

	public static void main(String[] args) {
		/*
		 * << Object >>
		 * Object 클래스는 클래스 계층 루트입니다. 
		 * 모든 클래스는 슈퍼 클래스로서 Object를 가집니다. 
		 * 배열을 포함한 모든 객체는 이 클래스의 메서드를 구현합니다.
		 */
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		/*
		 * <<Object>>
		 * public String toString();
		 * Returns:
		 * 		a string representation of the object.
		 * 
		 */
		String str1 = o1.toString();
		System.out.println(str1);
		System.out.println(o2);
		
		/*
		 * <<Object>>
		public boolean equals(Object obj)
			- Indicates whether some other object is "equal to" this one.
			- 주소가 동일한지 비교
			
		Parameters:
			obj - the reference object with which to compare.
			
		Returns:
			true if this object is the same as the obj argument; false otherwise.
		 */
		if(o1.equals(02)) { //o1 == o2 와 같음
			System.out.println("o1과 o2주소가 동일하다. [equals]");
		}else {
			System.out.println("o1과 o2주소가 동일하지 않다. [equals]");
		}
		if(o1.equals(o3)) {
			System.out.println("o1과 o3주소가 동일하다. [equals]");
		}else {
			System.out.println("o1과 o3주소가 동일하지 않다. [equals]");
		}
		
		if(o1 == o2) {
			System.out.println("o1 == o2주소가 동일하다. [==]");
		}else {
			System.out.println("o1과 o2주소가 동일하지 않다. [==]");
		}
		if(o1 == o3) {
			System.out.println("o1 == o3주소가 동일하다. [==]");
		}else {
			System.out.println("o1과  o3주소가 동일하지 않다. [==]");
		}
		
		
		
		System.out.println("---------------ObjectVhild---------------");
		ObjectChild oc1 = new ObjectChild();
		ObjectChild oc2 = new ObjectChild();
		ObjectChild oc3 = oc1;
		System.out.println("-------상속받은 object.equals메소드 사용------");
		if(oc1.equals(oc3)) {
			System.out.println("oc1과 oc3주소가 동일하다.");
		}
		System.out.println("-------상속받은 object.toString -> 재정의------");
		System.out.println("oc1.toString()");
		System.out.println(oc2);
		System.out.println(oc3);
		
		
	}

}
