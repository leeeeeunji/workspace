
public class IfUse {

	public static void main(String[] args) {
		/*
		 * 짝수, 홀수 판별
		 */
		int no1 = 50;
		
		if(no1%2==0) {
			System.out.printf("%d은 %s입니다.\n",no1,"짝수");//\n 안 쓰면 다음 문장이 이어서 출력됨
		}else {
			System.out.printf("%d은 %s입니다.\n",no1,"홀수");//%d = 숫자, %s=문자열(string)
		}
		/*
		 * 4의 배수 판별
		 */
		int no2 = 4000;
		if(no2%4==0) {
			System.out.printf("%d은 4의 배수.\n",no2);
		}else {
			System.out.printf("%d은 4의 배수 아님.\n",no2);
		}
		/*
		 * 정수의 유효성 체크
		 */
		int kor = -90;
		if(kor >= 0 && kor <= 100) {
			System.out.printf("%d은 유효한 점수입니다.\n",kor);
		}else {
			System.out.printf("%d은 유효한 점수가 아닙니다.\n",kor);
		}
		/*
		 * 윤년여부 출력
		 */
		int year=2022;
		String msg = "";
		if((year%4==0 && year%100!=0) || year%400==0) {
			msg="윤년";
		}else {
			msg="평년";
		}
		System.out.printf("%d는 %s입니다.\n",year,msg);
		/*
		 * 공배수
		 */
		int no3=45;
		if(no3%3==0 && no3%4==0) {
			System.out.printf("%10d는 3과 4의 공배수입니다.\n",no3);
			//+10d : 왼쪽으로 10칸 띄워 정렬, -10d : 오른쪽으로 10칸 띄워 정렬
		}else {
			System.out.printf("%10d는 3과 4의\t공배수가 아닙니다.\n",no3);//\t : 탭키만큼 띄워짐
		}
		/*
		 * 문자 판단
		 */
		char c='X';
		
		if(c >= 'A' && c <= 'Z') {
			System.out.printf("%c는 알파벳 대문자입니다.\n",c);//\c=char
		}
		c='9';
		if(c >= '0' && c <='9') {
			System.out.printf("%c는 숫자 형태의 문자입니다.\n",c);
		}
		
		/*
		 * Quiz :
		 다음 문자는 아이디의 첫 글자입니다.
		 이 문자가 아이디의 첫 글자로 유효한지 판단 후 출력하세요.
		 - 아이디의 첫 글자는 알파벳 대문자이거나 소문자이다.
		 */
		char idFirstLetter='*';
		
		if((idFirstLetter >= 'A' && idFirstLetter <='Z') || (idFirstLetter >='a' && idFirstLetter <='z')) {
			System.out.printf("%c는 아이디의 첫 글자로 유효합니다\n",idFirstLetter);
		}else {
			System.out.printf("%c는 아이디의 첫 글자로 유효하지 않습니다\n",idFirstLetter);
			
		}
		
	}

}
