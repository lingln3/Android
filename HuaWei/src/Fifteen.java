import java.util.LinkedHashSet;
import java.util.Scanner;


public class Fifteen {
	char[] ch;
	String s,s2;
	String[] s3;
	LinkedHashSet<String> str = new LinkedHashSet<String>();
	public void get()
	{	
		Scanner scan = new Scanner(System.in);
		s = scan.nextLine();
		ch = s.toCharArray();
		int size = s.length();
		for(int i = 0 ; i<size; i++)
		{
			ch[i] = isAlphabet(ch[i]);
		}
		s2 = new String(ch);
		s3 = s2.split(",");		
		for(int i=0 ; i<s3.length;i++)
		{
			if(!s3[i].isEmpty()
					&&s3[i].length() >1)
			{
				str.add(s3[i]);
			}
		}
		String[] s4 = new String[str.size()];
		str.toArray(s4);
		for(int i = 0 ; i<s4.length-1;i++)
		{
			System.out.print(s4[i]+' ');
		}		
		System.out.print(s4[s4.length-1]);
	}
	public static char isAlphabet(char c)
	{
		
		char result = '0';
		if(c >='A' 
				&& c <='Z')
		{
			result = c;
		}
		else if(c >='a' 
				&& c <='z')
		{
			result = c;
		}
		else{
			result = ',';
		}
		return result;
	}
}
