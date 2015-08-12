
public class Gerbil {
	private static int count = 0;
	private int gerbilNumber;
	private String hopInfo;
	Gerbil()
	{
		gerbilNumber = ++count;
		hopInfo = "hi";
	}
	public void hop()
	{
		System.out.println(this.gerbilNumber+this.hopInfo);
	}
}
