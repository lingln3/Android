import java.util.Scanner;


public class Main {

	char[] pcAddend;
	char[] pcAugend;
	char[] pcAddResult;
	
	public static void main(String[] args)
	{		
		String str1,str2;
		Main main = new Main();		
		Scanner scan = new Scanner(System.in);
		str1 = scan.next();
		str2 = scan.next();
		//确保addend的长度比augend长
		if(str1.length() >= str2.length())
		{
			main.pcAddend = new char[str1.length()];
			main.pcAugend = new char[str2.length()];
			main.pcAddend = str1.toCharArray();
			main.pcAugend = str2.toCharArray();			
		}
		else
		{
			main.pcAugend = new char[str1.length()];
			main.pcAddend = new char[str2.length()];
			main.pcAugend = str1.toCharArray();
			main.pcAddend = str2.toCharArray();	
		}
		main.change(main.pcAddend);
		main.change(main.pcAugend);
		main.AddLongInteger(main);
		main.change(main.pcAddResult);
		if(main.pcAddResult[0] != 0)
		{
			for(char c:main.pcAddResult)
			{
				System.out.print(c);			
			}
		}
		else
		{
			for(int i = 1; i < main.pcAddResult.length; i++)
			{
				System.out.print(main.pcAddResult[i]);
			}
		}		
	}
	public void AddLongInteger(Main main)
	{
		int jinwei1 = 0,jinwei2=0;
		int result = 0;
		int sum = 0;
		int length = main.pcAugend.length;
		int length2 = main.pcAddend.length;
		main.pcAddResult = new char[length2+1];
		char[] jinw = new char[length];		
		for(int i = 0; i < length ;  i++)
		{
			sum = (main.pcAddend[i]-'0') + (main.pcAugend[i] - '0');
			result = sum%10;
			jinwei2 = sum/10; //只有0，1
//			jinw[i] =(char) (jinwei + '0');			
			int temp = jinwei1 + result;
			main.pcAddResult[i] = (char)(temp + '0');	
			jinwei1 = jinwei2;			
		}
			for(int i = length; i<length2 ; i++)
			{
				sum = (int)(main.pcAddend[i]-'0') + jinwei1;				
				result = sum%10;
				jinwei2 = sum/10;
				main.pcAddResult[i] = (char) (result +'0');
				jinwei1 = jinwei2;
			}
			if(jinwei1 != 0)
			{
				main.pcAddResult[length2] = (char) (jinwei1 +'0');
			}		
	}
	public void change(char[] ch)
	{
		int length = ch.length;
		for(int i = 0 ; i < length/2 ; i++)
		{
			char temp = ch[i];
			ch[i] = ch[length-i-1];
			ch[length-i-1] = temp;			
		}
	}
}
