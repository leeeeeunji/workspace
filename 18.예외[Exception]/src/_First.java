import java.io.*;

public class _First {
	private _Second second;
	public _First() {
		second = new _Second();
	}
	
	public void method1() throws NullPointerException, IOException {
		System.out.println("\t first.method1() 실행");
		
		second.method2();
		System.out.println("\t first.method1() 반환");
		return;
	}
}
