
public class OperatorArithmathic {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int result=0;
		
		result=a+b;
		System.out.println("a+b -> "+result);
		result=a-b;
		System.out.println("a-b -> "+result);
		result=a*b;
		System.out.println("a*b -> "+result);
		result=a/b;
		System.out.println("a/b -> "+result);//int는 소수불가라 0으로 뜸
		double dresult = (double)a/b;
		System.out.println("a/b -> "+dresult);
		
		
		/*
		 * 나머지연산자
		 * %
		 */
		result=a%b;
		System.out.println(result);
		
		int year=2022;
		result=year%4;//0,1,2,3
		System.out.println(result);
		result=year%100;//0~99
		System.out.println(result);
		result=year%400;//0~399
		System.out.println(result);
		
		int no = 16;
		result = no%4;
		System.out.println(result);//result변수의 값이 0이면 4의 배수
		
		
		System.out.println("--------문자연산---------");
		
		
		/*
		 * 비트연산자
		 * << , >>
		 * int d = 1;  => 1=4byte -> 00000000|00000000|00000000|00000001
		 * int d << 1; => 1=4byte -> 00000000|00000000|00000000|00000010
		 * int d << 2; => 1=4byte -> 00000000|00000000|00000000|00000100
		 * int d << 3; => 1=4byte -> 00000000|00000000|00000000|00001000
		 * int d << 4; => 1=4byte -> 00000000|00000000|00000000|00010000
		 */
		
		int d = 1;
		System.out.println(d);
		result = d << 1;
		System.out.println(result);
		result = d << 2;
		System.out.println(result);
		result = d << 3;
		System.out.println(result);
		result = d << 4;
		System.out.println(result);
		
		/*
		 *  int d = 128;     => 00000000|00000000|0000000|10000000
		 *  result = d >> 1; => 00000000|00000000|0000000|01000000
		 *  result = d >> 2; => 00000000|00000000|0000000|00100000
		 *  result = d >> 3; => 00000000|00000000|0000000|00010000
		 *  result = d >> 4; => 00000000|00000000|0000000|00001000
		 */
		
		d = 128;
		System.out.println(d);
		result = d >> 1;
		System.out.println(result);
		result = d >> 2;
		System.out.println(result);
		result = d >> 3;
		System.out.println(result);
		result = d >> 4;
		System.out.println(result);
		System.out.println("-----------문자연산------------");
		char ca='A';
		char cz='Z';
		int numOfAlphabet = cz-ca+1;
		System.out.println("알파벳 대문자 수 : "+numOfAlphabet);
		char c='a';
		System.out.println(c);
		c = 'a' + 1;
		System.out.println(c);
		c = 'a' + 2;
		System.out.println(c);
		
		
		
		

	}

}
