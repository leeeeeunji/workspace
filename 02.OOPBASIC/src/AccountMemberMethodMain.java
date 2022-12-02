
public class AccountMemberMethodMain {

	public static void main(String[] args) {
		/**********************Case 1*********************/
		/*
		 * 계좌객체 생성 
		 */
		Account account1 = new Account();
		
		/*
		 * 계좌 데이타 대입
		 */
		account1.setAccountData(1111, "KIM", 70000, 3.4);
		
		/*
		 * 8000원 입금
		 */
		System.out.println("-------입금 전-------");
		account1.print();
		account1.deposit( 8000 );
		System.out.println("-------입금 후-------");
		account1.print();
		
		/*
		 * 300원 출금
		 */
		System.out.println("-------출금 후-------");
		account1.withDraw(300);
		account1.headerprint();
		account1.print();
		
		/**********************Case 2*********************/
		/*
		 * 1. 은행 모든 계좌에 잔고 50원 증가
		 */
		/*
		 * 1-1. 전체 계좌 생성
		 * 1-2. 계좌 데이터 대입
		 */
		Account acc1 = new Account();
		acc1.setAccountData(1000, "KANG", 89000, 5.6);
		Account acc2 = new Account();
		acc2.setAccountData(2000, "SIM", 85000, 3.2);
		Account acc3 = new Account();
		acc3.setAccountData(3000, "HONG", 36000, 2.5);
		
		
		/*
		 * 1-3. 모든 계좌 잔고 50원 증가
		 */
		acc1.deposit(50);
		acc2.deposit(50);
		acc3.deposit(50);
		/*
		 * 2. 은행 계좌 전체 정보 출력
		 */
		acc1.headerprint();
		acc1.print();
		acc2.print();
		acc3.print();
		
	}

}
