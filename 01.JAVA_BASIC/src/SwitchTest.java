/*
		switch 문
		 - 형식
		    switch(변수){
		    	case 값_1:
		    	  stmt1;
		    	  break;
		    	case 값_2:
		    	  stmt2;
		    	  break;  
		        case 값_n:
		          stmt3;
		    	  break;
		        default:
		          stmt4;
		    }
		switch(변수)  변수값은 byte,short,int char 
		              값이올수있다.(long 은안됨)
*/
public class SwitchTest {

	public static void main(String[] args) {
		int level=1;//게임 레벨 : 1~5사이의 정수
		
		switch (level) {
		case 1:
			/*명령문 기술 위치*/
			System.out.println("초보");
			/*
			 * break -> switch block을 빠져나간다. for block에서도 사용
			 */
			break;
		case 2:
			System.out.println("중수");
			break;
		case 3:
			System.out.println("고수");//3,4,5 동일해서 3,4의 출력 또는 break를 생략하면 5로 출력 됨
			break;
		case 4:
			System.out.println("고수");//아예 안 쓰면 
			break;
		case 5:
			System.out.println("고수");
			break;

		default://안 써도 됨. 안 쓴 상태에서 위 케이스값에 해당하지 않으면 아무 값도 출력되지 않음
			System.out.println("레벨은 1~5사이의 정수입니다.");
			break;
		}

	}

}
