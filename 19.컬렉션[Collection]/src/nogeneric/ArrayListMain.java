package nogeneric;

import java.util.*;

public class ArrayListMain {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1111, "MING", 10000, 1.1);
		Account acc2 = new Account(2222, "KING", 20000, 2.2);
		Account acc3 = new Account(3333, "KING", 30000, 3.3);
		Account acc4 = new Account(4444, "YONG", 40000, 4.4);
		Account acc5 = new Account(5555, "SANG", 50000, 5.5);
		
		ArrayList accountList = new ArrayList();
		int size = accountList.size();
		System.out.println("#size : " + size);
		
		System.out.println("*************1. add메소드[맨 마지막 index에 객체 저장]*************");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		System.out.println("#size : " + accountList.size());
		System.out.println(accountList);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("#size : " + accountList.size());
		System.out.println(accountList);
		
		System.out.println("*************2. add메소드[지정된 index에 객체 저장]*************");
		accountList.add(2, new Account(3332, "KING", 25000, 2.1));
		System.out.println("#size : " + accountList.size());
		System.out.println(accountList);
		
		System.out.println("*************3. set(index, element)[지정된 index에 객체 저장]*************");
		accountList.set(5, new Account(6666, "LAST", 60000, 6.6));
		System.out.println("#size : " + accountList.size());
		System.out.println(accountList);
		
		System.out.println("**************************4. get(index)*************************");
		Account getAccount = (Account)accountList.get(1);
		System.out.println(getAccount);
		
		System.out.println("************************5. remove(index)************************");
		Account removeAccount = (Account)accountList.remove(1);
		removeAccount.print();
		System.out.println("#size : " + accountList.size());
		System.out.println(accountList);
		
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("********************1. 계좌 전체 출력*********************");
		Account.headerprint();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			tempAccount.print();
		}
		
		Account.headerprint();
		for (Object objectAccount : accountList) {
			/*
			Account tempAccount = (Account)objectAccount;
			tempAccount.print();
			 */
			((Account)objectAccount).print();
		}

		System.out.println("******************2. 계좌번호 3333 출력*******************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getNo() == 3333) {
				tempAccount.print();
				break;
			}
		}
		
		System.out.println("*****************3. 계좌주 이름 KING 출력******************");
		for (int i = 0; i < accountList.size(); i++) {
			if(((Account)accountList.get(i)).getOwner().equals("KING")) {
				((Account)accountList.get(i)).print();
			}
		}
		
		System.out.println("******************4. 계좌번호 4444 삭제*******************");
		for(int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getNo() == 4444) {
				System.out.println(">> remove 전 size : " + accountList.size());
				Account rAccount = (Account)accountList.remove(i);
				rAccount.print();
				System.out.println(">> remove 후 size : " + accountList.size());
				break;
			}
		}
		System.out.println(accountList);
		System.out.println("*****************5. 계좌주 이름 KING 삭제******************");
		for(int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getOwner().equals("KING")) {
				Account rAccount = (Account)accountList.remove(i);
				rAccount.print();
			}
		}
		System.out.println(accountList);
		
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("**********************계좌 전체 출력**********************");
		Account.headerprint();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			tempAccount.print();
		}
		
		
	}

}
