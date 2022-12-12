package client;

import java.net.*;

public class ClientSocketMain {

	public static void main(String[] args) throws Exception {
		/*
		Socket socket = new Socket("www.naver.com",80);
		System.out.println(socket);
		 */
		Socket socket = new Socket("192.168.15.10", 3333);
		System.out.println("client 쪽 socket : " + socket);
		InetAddress remoteAddress = socket.getInetAddress();
		InetAddress localAddress = socket.getInetAddress();
		System.out.println("remote ip : " + remoteAddress.getHostAddress());
		System.out.println("remote port : " + socket.getPort());
		System.out.println("local ip : " + localAddress.getHostAddress());
		System.out.println("local port : " + socket.getLocalPort());
		
	}

}
