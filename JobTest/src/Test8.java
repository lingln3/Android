
public class Test8 {
	private static int a = 0;
	public static int b = 0;
	int c = 0;
	public int returnC()
	{
		return c;
	}
	public static void jingtai()
	{
		
	}
	public void eat()
	{
		
		
		b++;
		c++;
		Test3.println("fa"+b+","+c);
	}
	public void eat(int b)
	{
		
		b++;
		c++;
		Test3.println("fa"+b+","+c);
	}
}

class Test9 extends Test8
{
	int c = 12;
	public void eat()
	{
		Test3.println("son");
	}
	public void eat(String s)
	{
		Test3.println(s);
	}
	public int returnC(int i)
	{
		return c;
	}
}
