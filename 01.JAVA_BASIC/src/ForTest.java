/*
	for문
	     -형식:
	       	       
	       for(1;2;3){
	       	//1.반복변수(선언,초기화가능)
	       	//2.반복변수의 조건검사(논리형데이타)
	       	//3.반복변수증,감(++,--)
	       }
	       
	       ex>
	       for(int i=0;i<10;i++){
	       	 stmt1;
	       }
	       ex>무한루프
	       for(;;){
	       	
	       }
	
*/
public class ForTest {

	public static void main(String[] args) {
		System.out.println("--------while--------");
		int k=0;//1.반복변수선언 초기화
		while(k<10) { //2.반복변수비교(반복조건)
			//3.반복문
			System.out.print("k="+k+" ");
			k++; //4.반복변수증감			
		}
		System.out.println();
		System.out.println("--------for i 증가--------");
		for(int i=0/*1.반복변수선언 초기화*/;i<10/*2.반복조건검사*/;i++/*4.반복변수 증감*/) {
			System.out.print("i="+i+" ");/*3.반복문 실행*/
		}
		
		System.out.println();
		for (int i=0; i<10 ; i++) {
			System.out.print("i="+i+" ");
		}
		System.out.println();
		System.out.println("--------for i 감소--------");
		for(int i=10 ; i>0 ; i--) {
			System.out.print("i="+i+" ");
		}
		System.out.println();
		System.out.println(">>홀수만 출력 [1~100]");
		for(int i=1 ; i<=100 ; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(">>짝수만 출력 [1~100] continue");
		for(int i=1 ; i<=100 ; i++) {
			if(i%2==1) {
				/*
				 - 홀수 조건 만족 
				 => continue문 실행 + 현재 실행 중인 for블록을 실행하지 않고 다음 횟수의 블록을 실행.
				 
				 */
				continue;
				/*
				 * 1. continue문 이후의 for블록코드를 실행하지 않음.
				 * 2. 다음 반복을 계속(continue) 실행한다. 
				 */
			}
			/*
			 * 짝수 출력
			 */
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(">>4의 배수 출력 [1~100] continue");
		for(int i=1 ; i<=100 ; i++) {
			if(i%4==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(">>3과 4의 공배수[1~100]");
		for(int i=1 ; i<=100 ; i++ ) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		System.out.println(">>3과 4의 최소공배수[1~100]");
		for(int i=1 ; i<=100 ; i++ ) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+" ");
				break;
				/*
				 * break문
				 	1. 반복문에서 사용 가능(+switch에서도 사용)
				 	2. break문 이후의 for블록 코드를 실행하지 않는다.(=continue)
				 	3. 다음 반복문도 실행하지 않는다.(continue와의 차이점. continue는 다음 반복문 실행)
				 */
			}
		}
		System.out.println();
		System.out.println(">>홀수 합, 짝수 합[1~100]");
		
		int oddTot=0;
		int evenTot=0;
		for(int i=0 ; i<=100 ; i++) {
			if(i%2==0) {
				//짝수 누적
				evenTot+=i;//evenTot=evenTot+i;
			}else {
				//홀수 누적
				oddTot+=i;//oddTot=oddTot+i;
			}
		}
		System.out.println("짝수합 : "+evenTot);
		System.out.println("홀수합 : "+oddTot);
		System.out.println("--------문자출력---------");
		for(char c='a' ; c<='z' ; c++) {
			System.out.print(c);
			if(c=='z') {
				continue;
			}
			System.out.print(",");
		}
		System.out.println();
		
		for(char c='a' ; c<='z' ; c++) {
			System.out.print(c);
			if(c=='z') {
				continue;
			}
			System.out.print(",");
			/*
			 * 5개문자씩 출력
			 */
			if((c-'a'+1)%5==0) {
				System.out.print("\n");
			}
				
		}
		System.out.println();
		
		
	}
	
}
