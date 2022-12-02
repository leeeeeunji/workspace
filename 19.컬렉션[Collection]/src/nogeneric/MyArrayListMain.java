package nogeneric;

public class MyArrayListMain {

	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList();
		System.out.println("# list size : " + myArrayList.size());
		myArrayList.add(new Account(1, null, 1000, 0.1));
		myArrayList.add(new Account(2, null, 2000, 1.1));
		myArrayList.add(new Account(3, null, 3000, 2.1));
		myArrayList.add(new Account(4, null, 4000, 3.1));
		System.out.println("# list size : " + myArrayList.size());
		Account accountObject = (Account)myArrayList.get(2);
		accountObject.print();
		
		Account removeAccount = (Account)myArrayList.remove(4);
		System.out.println("# list size : " + myArrayList.size());
		
		for(int i = 0; i < myArrayList.size(); i++) {
			Account tempAccount = (Account)myArrayList.get(i);
			tempAccount.print();
		}
	}

}
