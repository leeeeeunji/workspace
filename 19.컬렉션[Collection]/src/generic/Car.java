package generic;
/*
 * 1. 주차장에서 차 객체를 생성할 클래스(틀)
 * 2. Car 객체의 주소를 저장할 수 있는 타입
 */
/**
 * 차 객체를 생성하기 위한 클래스
 * @author KIM
 * @version 0.2
 *
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
	private String no;//차량번호
	private int inTime;//입차시간
	private int outTime;//출차시간
	private int fee;//주차요금
	/*
	 * 생성자메소드[초기화]
	 */
	/*
	 * 멤버필드의 기본값을 가진 차 객체 생성
	 */
	/**
	 * 기본 초기값을 가진 차객체 생성
	 */
	public Car() {
		
	}
	/*
	 * 차량번호, 입차시간을 인자로 받아 멤버필드의 값을 가진 차 객체 생성
	 */
	/**
	 * 입차 데이타로 초기화된 차 객체 생성
	 * @param no 차량번호
	 * @param inTime 입차시간
	 */
	
	public Car(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	
	/*
	 * 차량 멤버데이타를 인자로 받아 멤버필드의 값을 가진 차 객체 생성
	 */
	/**
	 * 매개변수로 초기화된 차 객체 생성
	 * @param no 차량번호
	 * @param inTime 입차시간
	 * @param outTime 출차시간
	 * @param fee 주차요금
	 */
	public Car(String no, int inTime, int outTime, int fee) {
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}
	
	
	/*
	 * 멤버메소드[기능]
	 */
	/*
	 * 입차 시 데이타(차량번호, 입차시간)대입
	 */
	/**
	 * 입차시 입차데이타 대입메소드
	 * @param no 차량번호
	 * @param inTime 입차시간
	 */
	public void setIpchaData(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	
	/*
	 * 출차시간 멤버필드 = outTime 에 출차시간 데이타 대입
	 */
	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}
	
	/*
	 * 주차요금 계산
	 */
	/**
	 * 주차요금계산
	 */
	public void calculateFee() {
		this.fee = (this.outTime - this.inTime)*1000;
	}
	
	/*
	 * 차량정보 출력 
	 */
	public static void header() {
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("-----------------------------------");
	}
	public void print() {
		System.out.printf("%6s %7d %8d %9d\n",this.no,this.inTime,this.outTime,this.fee);
	}

	/*
	 * settet, gettet 메소드 자동생성단축기
	 * alt + Shift + s --> r
	 */
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	/**
	 * 
	 * @return 주차요금
	 */
	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getOutTime() {
		return outTime;
	}
	
	
	
	
	
}
