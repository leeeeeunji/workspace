package characterstream;

import java.io.*;
import java.net.*;

public class WebServerDataReadMain {

	public static void main(String[] args) throws Exception {
		/*******************html(text)*****************/
		URL urlStr = new URL("https://www.google.com/imgres?imgurl=https%3A%2F%2Fentertainimg.kbsmedia.co.kr%2Fcms%2Fuploads%2FPERSON_20210810081634_aef399d7747a9e97847b080ef3e9ca17.jpg&imgrefurl=https%3A%2F%2Fkstar.kbs.co.kr%2Fperson_view.html%3Fidx%3D154539&tbnid=hYXSwv_PqNEBWM&vet=12ahUKEwj2sMingeT7AhVTUN4KHRLbBg4QMygDegUIARDjAQ..i&docid=Z5LvG1v4iGhaGM&w=500&h=722&q=%EC%A1%B0%EC%9D%B8%EC%84%B1&ved=2ahUKEwj2sMingeT7AhVTUN4KHRLbBg4QMygDegUIARDjAQ");
		InputStream in = urlStr.openStream();
		FileOutputStream fout = new FileOutputStream("image.gif");
		
		while(true) {
			int readByte = in.read();
			if(readByte == -1) break;
			fout.write(readByte);
			//System.out.print((char)readByte);
		}
		in.close();
		fout.close();

	}

}
