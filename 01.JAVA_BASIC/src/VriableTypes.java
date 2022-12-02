
public class VriableTypes {
	public static void main(String[] args) {
		/*
		 논리형(1byte)
		 	-논리형 변수
		 	-논리형 리터럴(값,데이터): true,false
		 */
		boolean bool1;
		boolean bool2;
		boolean bool3;
		boolean bool4;
		bool1 = true;
		bool2 = false;
		bool3 = true;
		bool4 = bool3;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		System.out.println(bool4);
		/*
		 * 문자형(한개의 문자)(2byte)
		 * 	-문자형변수
		 * 	-문자형리터럴: 'A','힣','a','1'
		 */ 
		char munja1,munja2,munja3,munja4,munja5,munja6;
		munja1='A';
		munja2='B';
		munja3='김';
		munja4='경';
		munja5='1';
		munja6 = munja3;
		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja3);
		System.out.println(munja4);
		System.out.println(munja5);
		System.out.println(munja6);
		/*
		 * 숫자형
		 * 	1. 정수형 변수(byte,short,int,long)
		 * 		- 정수형 리터럴 : 1,2,4,56,-9000,231123
		 * 	2. 실수형 변수(float,double)
		 * 		- 실수형 리터럴 : 0.1,.1,3.141592,10000.0 
		 */
		
		byte b1 = 3;
		byte b2 = -128;
		byte b3 = 127;
		byte b4 = 0b01111111;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		short s1 = 767;
		short s2 = -32768;
		short s3 = 32767;
		short s4 = 0b0111111111111111;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
		int i1,i2,i3,i4,i5,i6;
		i1=90;
		i2=-90;
		i3=-2147483648;
		i4=2147483647;
		i5=0b01111111111111111111111111111111;
		i6=i1;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
	
		
		long l1 = 232;
		long l2 = 2147483648L;
		/*
		 * 2147483647까지만 리터럴로 인정됨
		 * long과 상관없이 숫자가 커서 불가
		 * 뒤에L 붙이면 초과되는 수도 가능
		 */
		
		System.out.println(l1);
		System.out.println(l2);
		
		
		float f1,f2,f3;
		f1 = 0.1F;
		f2 = 3.14F;
		f3 = 10000.0F;
		/* float은 정수형리터럴이라 소수 불가
		 * 소수 사용하려면 double 사용해야함
		 * 또는 뒤에 F붙이면 소수 가능
		 */
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		
		double d1,d2,d3;
		d1 = 3.141592;
		d2 = 12345678912345678.0;
		d3 = 0.12345678912345678912345678;
		System.out.println(d1);
		System.out.println(d2);//숫자 너무 길어서 1.2345678912345678E16 이렇게 끝처리
		System.out.println(d3);//숫자 너무 길어서 0.12345678912345678 뒷자리 생략됨
		
		System.out.println("---------문자열형-----------");
		String str1="오늘은";
		String str2="수요일.";
		String str3="변수를 공부합니다.";
		System.out.println(str1);//ptrint로 입력 시 한 줄로 나옴
		System.out.println(str2);//println으로 입력하면 한 줄씩 띄어서
		System.out.println(str3);
		/*
		 * 문자열집합연산자( + )
		 */
		
		String str4 = str1+str2+str3;
		System.out.println(str4);
		String str5 = str1+" "+str2+" "+str3;
		System.out.println(str5);
		
		
		String name="이은지";
		int age=28;
		char gender='F';
		double height=166.0;
		
		String myInfo = name+" "+age+" "+gender+" "+height;
		System.out.println(myInfo);
		
		
				
		}
}
