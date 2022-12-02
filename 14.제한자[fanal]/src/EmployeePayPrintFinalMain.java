
public class EmployeePayPrintFinalMain {

	public static void main(String[] args) {
		Employee[] emps = {
				new Salaryemployee(1, "KIM", 30000000),
				new Salaryemployee(2, "LEE", 40000000),
				new Salaryemployee(3, "PARK", 20000000),
				new Hourlyemployee(4, "CHOI", 100, 20000),
				new Hourlyemployee(4, "GO", 100, 9000)
		};
		for(Employee emp : emps) { //(단수 : 복수)
			emp.calculatePay();
			System.out.println("------------" + emp.getName() + "님 급여명세표-----------");
			emp.print();
			double incentive = emp.calculateIncentive();
			System.out.println("\t인센티브 : " + incentive);
			System.out.println("----------------------------------------");
			System.out.println();
		}
		
		System.out.println("사원의 인센티브율 : " + Employee.INCENTIVE_RATE);
		
	}

}
