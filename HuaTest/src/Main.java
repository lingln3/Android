import java.util.Scanner;


public class Main {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = new String();
//		System.out.println("请输入一串数字字符串，字符串长度大于等于2");
		str = scan.next();
		char ch[] = str.toCharArray();	
		int m = count(ch);
		System.out.println(m);
	}
	
	public static int count(char[] ch)
	{
		int biaozhi = 0;
		for(int i = 0 ; i < ch.length-2; i++)
		{
			for(int j = i+2; j < ch.length-1; j++)
			{
				if(ch[i] == ch[j])
				{
					if(ch[i+1] == ch[j+1])
					{
						biaozhi = 1;
						break;
					}
				}
			}
		}		
		return biaozhi;
	}
}
