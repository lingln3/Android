package socketTest;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	
	public static void main(String[] args)
		throws IOException
	{
		//创建一个ServerSocket,用于监听客户端Socket的连接请求
		ServerSocket ss = new ServerSocket(12333);
		System.out.println("准备发送");
		//采用while循环不断接收来自客户端的请求
		while(true)
		{
			System.out.println(InetAddress.getLocalHost());

			//每当接收到客户端Socket的请求，客户端也对应产生一个Socket
			/*
			 * Socket accept():如果接收到一个客户端Socket的连接请求，该方法将返回一个
			 * 与连接客户端Socket对应的Socket；否则该方法将一直处于等待状态，线程也被阻塞
			 */
			Socket s = ss.accept();
			OutputStream os = s.getOutputStream();
			os.write("您好，您收到了服务器的新年祝福！\n".getBytes("utf-8"));
			System.out.println("已发送");
			//关闭输出流，关闭socket
			/*os.close();
			s.close();*/
		}
	}
}
