import java.util.Scanner;


public class Fourteen {
	String s;
	char[] ch;
	public void change()
	{
		Scanner scan = new Scanner(System.in);
		s = scan.next();
		ch = s.toCharArray();
		int size = s.length();
		for(int i = 0; i < size-1 ; i++)
		{
			if(ch[i] == ch[i+1])
			{
				ch[i] = isZ(ch[i]);
				ch[i+1] = isZ(ch[i]);
				i = i +1;
			}
			else
			{
				ch[i] = isZ(ch[i]);
			}
		}
		for(char c: ch)
		{
			System.out.print(c);
		}
	}
	public static char isZ(char c)
	{
		char result = '0';
		if(c == 'z')
		{
			result = 'a';
		}
		else{
			result = (char) (c + 1);
		}
		return result;
	}
}
