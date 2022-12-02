
public class ReferenceTypeAccountArrayMAin {

	public static void main(String[] args) {
		System.out.println("-----------값 목록으로 배열 생성-----------");
		Account acc1 = new Account(1111, "LEE", 56000, 0.9);
		Account[]accounts = {
				acc1,
				new Account(2222, "KIM", 58900, 1.3),
				new Account(3333, "PARK", 78000, 3.3),
				new Account(4444, "CHOI", 90000, 5.3),
				new Account(5555, "SIM", 56000, 4.3),
				new Account(6666, "SOO", 23000, 2.3),
				new Account(7777, "SONG", 12900, 7.3),
				new Account(8888, "MIN", 23400, 6.3),
				new Account(9999, "JANG", 87200, 0.3)
		};
		
		System.out.println("1. 은행 총 계좌 수 : " + accounts.length);
		System.out.println("2. 은행계좌 전체 출력");
		Account.headerprint();
		for(int i = 0; i < accounts.length; i++) {
			/*
			 * Account tempAccount = accounts[i];
			 * tempAccount.print();
			 */
			accounts[i].print();
		}
		
		System.out.println("3. 은행계좌들 총 잔고");
		int totBalance = 0;
		for(int i = 0; i < accounts.length; i++) {
			//totBalance = totBalance + accounts[i].getBalance();
			totBalance += accounts[i].getBalance();
		}
		System.out.println(">> " + totBalance);

		System.out.println("4. 은행 계좌들 중, 계좌번호 3333번 계좌 1개 찾아 출력(계좌번호는 중복되지 않는다.)");
		for(int i = 0; i < accounts.length; i++ ) {
			Account account = accounts[i];
			if(account.getNo() == 3333) {
				account.print();
				break;
			}
		}
		
		System.out.println("5. 은행 계좌들 중, 계좌 잔고 50000원 이상인 VIP계좌 여러개 찾아 출력[enhanced for]");
		for(Account tempAccount:accounts) {
			if(tempAccount.getBalance() >= 50000) {
				tempAccount.print();
			}
		}
		
		System.out.println("6. 은행 계좌들 중, 계좌 이율 2.0 이상인 계좌 여러개 찾아 출력 [Quiz]");
		
		System.out.println("6. 은행 계좌들 중, 이름이 KIM인 계좌 여러개 찾아 출력(String 객체 배우고 난 후)");
		
		System.out.println("7. 6666번 계좌에 3000원 입금");
		for(Account account : accounts) {
			if(account.getNo() == 6666) {
				System.out.println(">> 입금 전");
				account.print();
				account.deposit(3000);
				System.out.println(">> 입금 후");
				account.print();
				break;
			}
		}
		
		System.out.println("8.9999번 계좌에 3000원 출금 [Quiz]");
		
		
		System.out.println("9.계좌잔고 순으로 오름차순 정렬");
		System.out.println("#################정렬 전##################");
		for(int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		System.out.println("#################정렬 후#################");
		for(int i = 0; i < accounts.length-1; i++) {
			for(int j = 0; j < accounts.length-1; j++) {
				if(accounts[j].getBalance() > accounts[j + 1].getBalance()) {
					/*
					 * 주소값 교환
					 */
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = tempAccount;
				}
			}
		}
		for(int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
		
		System.out.println("9.계좌잔고 순으로 내림차순 정렬 [Quiz]");
		System.out.println("9.계좌번호 순으로 오름(내림)차순 정렬 [Quiz]");
		System.out.println("9.계좌이름 순으로 오름(내림)차순 정렬(String 클래스 배운 후)");
		System.out.println("10.5555계좌 한개 이율을 3.6으로 변경");
		for(Account account : accounts) {
			if(account.getNo() == 5555) {
				account.print();
				account.setIyul(3.6);
				account.print();
				break;
			}
		}
		
		System.out.println("11.VIP계좌(잔고50000원이상) 여러개 잔고 50원 증가");
		for(Account account : accounts) {
			if(account.getBalance() >= 50000) {
				account.deposit(50);
				account.print();
			}
		}
		
		System.out.println("------Account에 재정의된 toString메소드------");
		for(Account account : accounts)
			System.out.println(account);
			// = System.out.println(account.toString());
		
		System.out.println(accounts); //->주소값출력
		System.out.println(accounts[0]); // 0번째 값 출력
		System.out.println(accounts[accounts.length-1]); // 마지막 값 출력
		
		/********************OPTION***********************
		  1. accounts배열 객체에 새로생성한계좌객체 추가 
		  		A. accounts.length+1 개짜리 임시배열생성
		 		B. accounts의 모든계좌객체 임시배열로 이동
				C. 임시배열에 새로운  Account객체추가
		 		D. accounts에 임시배열주소대입
		 
		  2. accounts배열 객체에서 계좌번호 4444번계좌객체삭제
		  	 	A. accounts 에서 8888계좌찾아서 null대입
			 	B. accounts.length-1 개짜리 임시배열생성
			 	C. accounts null이아닌 모든계좌 임시배열로이동
			  	D. accounts 에 임시배열대입 
		****************************************************/	 
		System.out.println("----------------------------Account객체추가----------------------------");
		System.out.println("----------------------------Account객체삭제----------------------------");
		
		
		
		
	}

}
