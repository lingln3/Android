import java.util.LinkedHashSet;
import java.util.Scanner;


public class TwentyFour {
	LinkedHashSet<Character> list = new LinkedHashSet<Character>();
	public void change()
	{
		Scanner scan = new Scanner(System.in);
		String s;
		s = scan.next();
		while(s.endsWith("0"))
		{
			s = s.substring(0,s.length()-1);
		}
		char[] ch = s.toCharArray();
		if(ch[0] == '-')
		{
			list.add(ch[0]);			
				for(int i=s.length()-1;i>0;i--)
				{
					list.add(ch[i]);
				}			
		}
		else{
			for(int i=s.length()-1;i>=0;i--)
			{
				list.add(ch[i]);
			}		
		}
		for(char chch:list)
		{
			System.out.print(chch);
		}
	}
}
