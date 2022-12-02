package nogeneric;

import java.util.*;

public class HashSetMain {

	public static void main(String[] args) {
		Account acc1 = new Account(1111, "MING", 10000, 1.1);
		Account acc2 = new Account(2222, "KING", 20000, 2.2);
		Account acc3 = new Account(3333, "KING", 30000, 3.3);
		Account acc4 = new Account(4444, "YONG", 40000, 4.4);
		Account acc5 = new Account(5555, "SANG", 50000, 5.5);
		
		HashSet accountSet = new HashSet();
		System.out.println("# set size : " + accountSet.size());
		System.out.println(accountSet);
		System.out.println("-------------------add------------------");
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		System.out.println("# set size : " + accountSet.size());
		System.out.println(accountSet);
		System.out.println("--------------add[중복객체]-------------");
		/*
		 * Element의 equals메소드를 사용해서 중복체크를 한다.
		 */
		boolean isAdd = accountSet.add(acc1);
		System.out.println("추가여부 : " + isAdd); //false로 출력됨 -> 중복이니까~
		System.out.println("# set size : " + accountSet.size());
		System.out.println(accountSet);
		System.out.println("--------------remove[객체]-------------");
		boolean isRemove = accountSet.remove(acc5);
		System.out.println("삭제여부 : " + isRemove);
		System.out.println("# set size : " + accountSet.size());
		isRemove = accountSet.remove(acc5);
		System.out.println("삭제여부 : " + isRemove);
		System.out.println("# set size : " + accountSet.size());
		for (Object objectAccount : accountSet) {
			Account account = (Account)objectAccount;
			account.print();
		}
		System.out.println("----------------------toArray(Object[])---------------------");
		Object[] accountArray = accountSet.toArray();
		for (int i = 0; i < accountArray.length; i++) {
			Account account = (Account)accountArray[i];
			account.print();
		}
		
		System.out.println("######################전체출력[iteraton]###################");
		
		
		
		
		
		

	}

}
