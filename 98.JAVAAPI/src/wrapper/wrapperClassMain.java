package wrapper;

import java.util.*;

/*
- Wrapper 클래스

	자바 데이타형은 기본 데이타형과 레퍼런스 데이타형으로 구분됩니다.
	기본 데이타형으로는 int,boolean,double 등이 제공됩니다.
	이런 기본 데이타형을 객체로 사용할 수 있는 방법으로 
	Wrapper 클래스가 제공됩니다.
	Wrapper 클래스는 각종 유용한 기능들을 메서드로 제공받을 수 있다는
	장점이 있습니다.
	
	Integer,Boolean,Double,Character,Float,Long,Byte,Short
	
 */
public class wrapperClassMain {

	public static void main(String[] args) {
		
	System.out.println("-------------Boxing, UnBoxing-------------");
	/*
	 * Boxing [기본형 -> Wrapper 객체]
	 */
	Character wc = new Character('김');
	Integer wi = new Integer(1231);
	Double wd = new Double(3.111);
	Boolean wb = new Boolean(true);
	
	/*
	 * UnBoxing [Wrapper객체 -> 기본형]
	 */
	char c1 = wc.charValue();
	int i1 = wi.intValue();
	double d1 = wd.doubleValue();
	boolean b1 = wb.booleanValue();
	
	
	System.out.println("---------AutoBoxing, AutoUnBoxing---------");
	/*
	 * AutoBoxing [기본형 -> wrapper객체]
	 */
	Character wc2 = '김';
	Integer wi2 = 1231;
	Double wd2 = 3.1111;
	Boolean wb2 = true;
	
	/*
	 * AutoUnBoxing [Wrapper객체 -> 기본형]
	 */
	char c2 = wc2;
	int i2 = wi2;
	double d2 = wd2;
	boolean b2 = wb2;
	
	System.out.println("************************AUTO BOXIG**********************");
	int a = 89;
	int b = 40;
	int c = 50;
	int d = 60;
	int e = 70;
	
	Integer ia = new Integer(a);
	Integer ib = b;
	Integer ic = c;
	Integer id = d;
	Integer ie = e;

	
	System.out.println("************************자동 형변환**********************");
	Object oa = ia;
	Object ob = ib;
	Object oc = ic;
	Object od = id;
	Object oe = ie;

	
	System.out.println("*****************AUTO BOXIG, 자동 형변환*****************");
	
	Object ooa = 89;
	Object oob = 40;
	Object ooc = 50;
	Object ood = 60;
	Object ooe = 70;
	
	
	System.out.println("*************************Object[]************************");
	
	Object[] scoreArray = new Object[5];
	scoreArray[0] = 89;
	scoreArray[1] = 40;
	scoreArray[2] = 50;
	scoreArray[3] = 60;
	scoreArray[4] = 70;
	
	for (int i = 0; i < scoreArray.length; i++) {
		/*
		Integer tempScore = (Integer)scoreArray[i];
		int score = tempScore.intValue();
		System.out.println(score + " ");
		*/
		int score = (Integer)scoreArray[i];
		System.out.println(score + " ");
	}
		
		/********************************************************/
		
		System.out.println();
		Integer wi11 = new Integer(123);
		Integer wi22 = new Integer(123);
		
		System.out.println(wi11 == wi22);
		System.out.println(wi11.equals(wi22));
		System.out.println(wi11 >= wi22);
		System.out.println(wi11 <= wi22);
		System.out.println(wi11 == 123);    
		System.out.println(wi11 + wi22);    
		// ===>wrapper로 사칙연산, 비교 등 되도록 하지 않기 (결과값 제 멋대로 반환됨). 최대한 기본값으로 하기

	
	}

}
