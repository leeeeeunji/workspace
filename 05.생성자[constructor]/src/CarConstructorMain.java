
public class CarConstructorMain {

	public static void main(String[] args) {
		System.out.println("***************Car 1***************");
		Car car1 = new Car();
		car1.setIpchaData("1234", 12);
		car1.setOutTime(14);
		car1.calculateFee();
		car1.header();
		car1.print();
		System.out.println("***************Car 2***************");
		Car car2 = new Car("3453", 15);
		car2.setOutTime(17);
		car2.calculateFee();
		car1.header();
		car2.print();
		
		System.out.println("*****오늘 주차장 이용차량 출력*****");
		Car cara = new Car("1212", 1, 2, 1000);
		Car carb = new Car("3434", 12, 17, 5000);
		Car carc = new Car("5656", 6, 9, 3000);
		
		cara.header();
		cara.print();
		carb.print();
		carc.print();
	}

}
