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
		//����һ��ServerSocket,���ڼ����ͻ���Socket����������
		ServerSocket ss = new ServerSocket(12333);
		System.out.println("׼������");
		//����whileѭ�����Ͻ������Կͻ��˵�����
		while(true)
		{
			System.out.println(InetAddress.getLocalHost());

			//ÿ�����յ��ͻ���Socket�����󣬿ͻ���Ҳ��Ӧ����һ��Socket
			/*
			 * Socket accept():������յ�һ���ͻ���Socket���������󣬸÷���������һ��
			 * �����ӿͻ���Socket��Ӧ��Socket������÷�����һֱ���ڵȴ�״̬���߳�Ҳ������
			 */
			Socket s = ss.accept();
			OutputStream os = s.getOutputStream();
			os.write("���ã����յ��˷�����������ף����\n".getBytes("utf-8"));
			System.out.println("�ѷ���");
			//�ر���������ر�socket
			/*os.close();
			s.close();*/
		}
	}
}
