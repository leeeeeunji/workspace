package characterstream;

import java.io.*;

public class FileWriterReaderCopyMain {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("데미안.txt");
		FileWriter fw = new FileWriter("데미안[복사].txt");
		
		while(true) {
			int readChar = fr.read();
			if(readChar == -1) break;
			if(readChar == '.') {
				// . -9 -> \n -9
				fw.write(readChar);
				fw.write("\n");
			}else if(readChar == '-') {
				fw.write(readChar);
				fw.write(" page");
			}else {
				fw.write(readChar);
			}
		}
		fw.flush();
		fw.close();
		System.out.println("--------------fileWriterReaderCopy----------------");
	}

}
