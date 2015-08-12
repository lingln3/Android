import java.util.Arrays;


public class Test13 {
	protected int num;
	protected int no;
	
	public Test13[] sort_num(int suzu[])
	{
		Test13[] test =new Test13[suzu.length];
		for(int i = 0; i< suzu.length;i++)
		{
			test[i] = new Test13();
			test[i].num = suzu[i];
			test[i].no = i;
		}
//		Arrays.sort(test.num[]);
		return test;
	}
	
	public void sort_no(Test13[] test13)
	{
		
	}
	
	
}
