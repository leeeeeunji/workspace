
public class CarMemberMethodMain {

	public static void main(String[] args) {
		/*
		 * 1. 차량번호 1234 차량 12시 입차
		 */
		Car car1 = new Car();
		
		car1.setIpchaData("1234",12);
		
		/*
		 * 2. car1 차량 16시 출차
		 * 2-1. 출차시간 대입
		 */
		car1.setOutTime(16);
		
		/*
		 * 2-2. 주차요금 계산
		 */
		car1.calculateFee();
		
		/*
		 * 2-3. 주차요금 영수증 출력
		 */
		car1.print();

	}

}
