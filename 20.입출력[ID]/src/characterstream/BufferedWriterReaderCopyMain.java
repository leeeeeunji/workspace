package characterstream;

import java.io.*;

public class BufferedWriterReaderCopyMain {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("죄와벌.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("죄와벌[LINED].txt"));
		int lineNo = 0;
		
		while(true) {
			String readLine = br.readLine();
			if(readLine == null)break;
			readLine = readLine.replace("제이든", "조인성");
			lineNo++;
			bw.write("[" + lineNo + "]" + readLine);
			bw.newLine();
		}
		bw.flush();
		
		br.close();
		bw.close();
		System.out.println("--------BufferedWriterReader Copy " + lineNo + " line copy---------");

	}

}
