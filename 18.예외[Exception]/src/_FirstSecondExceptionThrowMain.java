import java.io.*;

public class _FirstSecondExceptionThrowMain {

	public static void main(String[] args) throws NullPointerException, IOException {
		
		System.out.println("1.main 흐름 start");
		_First first = new _First();
		System.out.println("2.main 흐름 first.method1(); 호출 전");
		first.method1();
		System.out.println("3.main 흐름 first.method1(); 호출 후 JVM반환");
		return;
		
		
	}

}
