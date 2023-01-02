package dao.common;

import java.io.*;
import java.util.*;

public class PropertiesFileLoadMain {

	public static void main(String[] args) throws Exception {
		/*
		 * properties파일을 loading하여 Properties객체[Map]를 만들어준다
		 */
		
		Properties properties = new  Properties();
		/*
		 * FileInputStream fis1 = new FileInputStream("C:\\2022-11-JAVA-DEVELOPER\\workspace\\25JDBC[Java DataBase Connectivity]\\src\\jdbc.properties");
		System.out.println(fis1);
		 */
		/*
		System.out.println(System.getProperty("java.class.path"));
		FileInputStream fis2 = new FileInputStream("C:\\2022-11-JAVA-DEVELOPER\\workspace\\25JDBC[Java DataBase Connectivity]\\src\\jdbc.properties");
		System.out.println(fis2);
		*/
		InputStream fis3= DataSource.class.getResourceAsStream("/jdbc.properties");
		System.out.println(fis3);
		
		
		properties.load(fis3);
		/*
		 * ---------------------------
		 * key(String) | value(String)
		 * ---------------------------
		 * driverClass | oracle.jdbc.OracleDriver
		 * ---------------------------
		 * url 		   | jdbc:oracle:thin:@182.237.126.19:1521:xe
		 * ---------------------------
		 * user		   | jdeveloper10
		 * ---------------------------
		 * password	   | jdeveloper10
		 */
		System.out.println("----------- properties.size():"+properties.size()+" ----------------");
		System.out.println(properties);
		
		System.out.println(properties.getProperty("driverClass"));
		System.out.println(properties.getProperty("url", "jdbc:oracle:thin:@localhost:1521:xe"));
		System.out.println(properties.getProperty("user", "scott")); // = user가 없다면 scott 출력해라
		System.out.println(properties.getProperty("password", "tiger"));

	}

}
