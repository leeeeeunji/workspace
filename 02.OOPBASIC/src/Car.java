/*
 * 1. 주차장에서 차 객체를 생성할 클래스(틀)
 * 2. Car 객체의 주소를 저장할 수 있는 타입
 */
public class Car {
	/*
	 * 클래스의 구성 요소
	 * 1.멤버필드(변수)[속성] : 차 객체의 속성데이타를 저장할 변수
	 * 2.멤버메소드[기능] : 차 객체가 외부에 제공하는 기능
	 */
	/*
	 * 멤버필드[속성]
	 */
	String no;//차량번호
	int inTime;//입차시간
	int outTime;//출차시간
	int fee;//주차요금
	/*
	 * 멤버메소드[기능]
	 */
	/*
	 * 입차 시 데이타(차량번호, 입차시간)대입
	 */
	void setIpchaData(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	
	/*
	 * 출차시간 멤버필드 = outTime 에 출차시간 데이타 대입
	 */
	void setOutTime(int outTime) {
		this.outTime = outTime;
	}
	
	/*
	 * 주차요금 계산
	 */
	void calculateFee() {
		this.fee = (this.outTime - this.inTime)*1000;
	}
	
	/*
	 * 차량정보 출력 
	 */
	void print() {
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("-----------------------------------");
		System.out.printf("%6s %7d %8d %9d",this.no,this.inTime,this.outTime,this.fee);
	}
}
