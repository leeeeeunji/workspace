
public class CarFactoryStaticMain {

	public static void main(String[] args) {
		Car car1 = new Car(1, "K3", "RED");
		Car car2 = new Car(2, "K5", "BLACK");
		Car car3 = new Car(3, "K7", "BLUE");
		
		System.out.println("차량 총 생산대수 : " + Car.count);
		
		Car.headerprint();
		car1.print();
		car2.print();
		car3.print();

	}

}
