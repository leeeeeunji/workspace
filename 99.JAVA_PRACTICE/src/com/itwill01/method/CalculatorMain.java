package com.itwill01.method;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		int result = cal.add(23,34);
		System.out.println(result);
		result = cal.sub(23,34);
		System.out.println(result);
		result = cal.mul(23,34);
		System.out.println(result);
		result = cal.div(45435,34);
		System.out.println(result);
		
		
		
	}

}
