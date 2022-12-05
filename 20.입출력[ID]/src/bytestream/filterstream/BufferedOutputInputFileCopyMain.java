package bytestream.filterstream;

import java.io.*;

public class BufferedOutputInputFileCopyMain {

	public static void main(String[] args) throws Exception {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("4.필터스트림.png"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("4.필터스트림.png"));
		
		int byteCount = 0;
		int starCount = 0;
		
		while(true) {
			int readByte = bis.read();
			if(readByte == -1)break;
			byteCount++;
			if(byteCount%1024 == 0) {
					System.out.print("★");
					starCount++;
					if(starCount%20 == 0) {
							System.out.println();
				}
			}
			bos.write(readByte);
		}
		
		bis.close();
		bos.close();
		System.out.println();
		System.out.println("BufferedOutputInputFileCopy : " + byteCount + "bytes copy!!");

	}

}
