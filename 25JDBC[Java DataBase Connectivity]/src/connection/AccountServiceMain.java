package connection;

public class AccountServiceMain {

	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		/*
		 * 모든 잔고 update 트랜잭션
		 */
		accountService.updateBalance(1);

	}

}
