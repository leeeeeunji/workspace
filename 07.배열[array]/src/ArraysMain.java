import java.util.*;

import org.omg.PortableServer.*;

public class ArraysMain {

	public static void main(String[] args) {
		int[] intArray1 = {1, 3, 5, 7, 9};
		int[] intArray2 = {1, 3, 5, 7, 9};
		String[] strArray1 = {"one", "two", "three"};
		String[] strArray2 = {"one", "two", "three"};

		System.out.println("1. 배열내용비교(equals)");
		boolean isSame = Arrays.equals(intArray1, intArray2);
		System.out.println(isSame);
		isSame = Arrays.equals(strArray1, strArray2);
		System.out.println(isSame);
		
		System.out.println("2.배열원소채우기(fill)");
		Arrays.fill(intArray1, 1);
		for(int e : intArray1) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		System.out.println("3.배열복사(기본형타입 배열)");
		int[] intArray3 = Arrays.copyOf(intArray2, intArray2.length + 1);
		for(int e : intArray3) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		
		
		int[] scoreArray = {90, 67, 88, 23, 56, 12, 34};
		String[] nameArray = {"공경호", "홍경호", "JAMES", "김경호", "김경호"};
		Account[] accountArray = {
				new Account(1111, "LEE", 56000, 0.9),
				new Account(2222, "KIM", 58900, 1.3),
				new Account(3333, "PARK", 78000, 3.3),
				new Account(4444, "CHOI", 90000, 5.3),
				new Account(5555, "SIM", 56000, 4.3),
				new Account(6666, "SOO", 23000, 2.3),
				new Account(7777, "SONG", 12900, 7.3),
				new Account(8888, "MIN", 23400, 6.3),
				new Account(9999, "JANG", 87200, 0.3)
		};
		
		
		System.out.println("3. 배열 복사(참조형타입 배열)");
		Account[] newAccountArray = Arrays.copyOf(accountArray, accountArray.length + 1);
		for(Account account : newAccountArray) { 
			System.out.println(account);
		}
		
		System.out.println("--------------------------------");
		
		/*
		void java.lang.System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length몇개)
		 */
		Account[] descAccounts = new Account[accountArray.length];
		System.arraycopy(accountArray, 0, descAccounts, 0, accountArray.length);
		
		for (Account account : descAccounts) {
			System.out.println(account);
		}		
		
		System.out.println("4.sort[기본타입 배열]");
		/*
		int[] scoreArray = {90, 67, 88, 23, 56, 12, 34};
		String[] nameArray = {"공경호", "홍경호", "JAMES", "김경호", "김경호"};
		Account[] accountArray = {
				new Account(1111, "LEE", 56000, 0.9),
				new Account(2222, "KIM", 58900, 1.3),
				new Account(3333, "PARK", 78000, 3.3),
				new Account(4444, "CHOI", 90000, 5.3),
				new Account(5555, "SIM", 56000, 4.3),
				new Account(6666, "SOO", 23000, 2.3),
				new Account(7777, "SONG", 12900, 7.3),
				new Account(8888, "MIN", 23400, 6.3),
				new Account(9999, "JANG", 87200, 0.3)
		};
		*/
		Arrays.sort(scoreArray);
		for(int score : scoreArray) {
			System.out.print(score + " ");
		}
		System.out.println();
		Arrays.sort(nameArray);
		for(String name : nameArray) {
			System.out.println(name + " ");
		}
		
		System.out.println("5. sort[Account] - Comparable");
		Arrays.sort(accountArray);
		/*
		<< Arrays.sort(accountArray); >>
			- Account[] 안에 있는 element(Account) 는 
  			  반드시 Comparable interface를 구현해야 한다.
  			  
		    - Arrays.sort(accountArray)메쏘드 정렬메카니즘
		    	A. 첫번째 객체와 두번째 객체를 Comparable 인터페이스타입으로 형변환한다.
			    B. 첫번째 Account객체와 두번째 Account객체를 비교한다.
			     		Account firstAccount=accountList.get(0); = Comparable firstAccount=(Comparable)accountList.get(0);
			     		Account secondAccount=accountList.get(1); = Comparable firstAccount=(Comparable)accountList.get(1);
			        	int result=firstAccount.compareTo(secondAccont);
			    C. 비교의 결과값 정수가 양수이면 첫번째와 두번째를 교환   한다. 
			       비교의 결과값 정수가 음수이면 첫번째와 두번째를 교환 안한다. 
			   
			    A. 두번째 객체와 세번째 객체를 Comparable 인터페이스타입으로 형변환한다.
			    B. 두번째 Account객체와 세번째 Account객체를 비교한다. 
			     	Account secondAccount=accountList.get(1);
			    	Account thirdAccount=accountList.get(2);
			    	int result=secondAccount.compareTo(thirdAccount);
			    C. 비교의 결과값 정수가 양수이면 두번째와 세번째를 교환   한다. 
			       비교의 결과값 정수가 음수이면 두번째와 세번째를 교환 안한다. 
		
		*/
		
		Account.headerprint();
		for (Account account : descAccounts) {
			account.print();
		}
		
		System.out.println("5. sort[Account] - Comparator");
		//Arrays.sort(accountArray, );
		Arrays.sort(accountArray, new AccountBalanceDescComparator());
		System.out.println("---------AccountBalanceDescComparator-----------");
		for(Account account : accountArray) {
			account.print();
		}
		Arrays.sort(accountArray, new AccountOwnerAscComparator());
		System.out.println("---------AccountOwnerAscComparator-----------");
		for(Account account : accountArray) {
			account.print();
		}
		
	}

}
