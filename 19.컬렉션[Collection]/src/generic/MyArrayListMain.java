package generic;

public class MyArrayListMain {

	public static void main(String[] args) {

		MyArrayList<Account> myArrayList = new MyArrayList<Account>();
		myArrayList.add(new Account(1111, "MING", 10000, 1.1));
		myArrayList.add(new Account(2222, "KING", 20000, 2.2));
		myArrayList.add(new Account(3333, "KING", 30000, 3.3));
		myArrayList.add(new Account(4444, "YONG", 40000, 4.4));
		myArrayList.add(new Account(5555, "SANG", 50000, 5.5));
		
		System.out.println("-----------add----------");
		System.out.println("# list size : " + myArrayList.size());
		Account account = myArrayList.get(0);
		System.out.println(account);
		Account remoAccount = myArrayList.remove(0);
		remoAccount.print();
		System.out.println("# list size : " + myArrayList.size());
	}

}
