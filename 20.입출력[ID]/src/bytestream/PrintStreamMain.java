package bytestream;

import java.io.*;

public class PrintStreamMain {

	public static void main(String[] args) throws Exception {
		PrintStream colsolePrintOut = System.out;
		
		PrintStream filePrintOut = new PrintStream(new FileOutputStream("printSream.txt"));
		
		String str = "프린트스트림을 공부합니다.";
		double d = 3.14159;
		char c = '힣';
		Object o = new Object();
		boolean isMarried = true;
		
		colsolePrintOut.println(str);
		filePrintOut.println(str);
		colsolePrintOut.println(d);
		filePrintOut.println(d);
		colsolePrintOut.println(c);
		filePrintOut.println(c);
		System.out.println(o.toString());
		filePrintOut.println(o);
		System.out.println(isMarried);
		filePrintOut.println(isMarried);
		System.out.println("--------PrintStream.println() -> console,printStream.txt");
		filePrintOut.println("--------PrintStream.println() -> console,printStream.txt");
		
		
	}

}
