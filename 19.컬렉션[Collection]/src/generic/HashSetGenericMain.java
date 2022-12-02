package generic;

import java.util.*;

public class HashSetGenericMain {

	public static void main(String[] args) {
		Account acc1 = new Account(1111, "MING", 10000, 1.1);
		Account acc2 = new Account(2222, "KING", 20000, 2.2);
		Account acc3 = new Account(3333, "KING", 30000, 3.3);
		Account acc4 = new Account(4444, "YONG", 40000, 4.4);
		Account acc5 = new Account(5555, "SANG", 50000, 5.5);
		
		HashSet<Account> accountSet = new HashSet<Account>();
		System.out.println("# map size : " + accountSet.size());
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		System.out.println("# map size : " + accountSet.size());
		System.out.println(accountSet);
		System.out.println("------------1. add-------------");
		boolean isAdd = accountSet.add(acc5);
		System.out.println("추가여부 : " + isAdd);
		System.out.println("# map size : " + accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("------------1. remove-------------");
		boolean isRemove = accountSet.remove(acc5);
		System.out.println("삭제여부 : " + isRemove);
		System.out.println("# map size : " + accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("%%%%%%%%%%%%전체출력%%%%%%%%%%%%%");
		Account.headerprint();
		for(Account account : accountSet) {
			account.print();
		}
		
		
		
		
	}

}
