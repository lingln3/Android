/*
 * �������ģʽsingleton
 * ���������ϵͳ�ڣ�һ����ֻ����һ��ʵ��
 */
public class Test10 {
	private int a = 10;
	public static int b = 20;
	private static Test10 instance = new Test10();
	static{
		b++;
		Test3.println("static code II"+b);
	}
	{
		a =100;
		b = 30;
	}
	public static Test10 getTest10()
	{
		return instance;
	}
	private Test10()
	{
		a++;
		Test3.println("constructor"+a);
	}
	static{
		Test3.println("static code");
	}
}
