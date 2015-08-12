/*
 * 单子设计模式singleton
 * 在整个软件系统内，一个类只能有一个实例
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
