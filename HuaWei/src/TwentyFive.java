import java.util.Scanner;


public class TwentyFive {
	String state = "";
	int num_r = 0,num_l=0;
	public void pipei()
	{
		StringBuilder s2 = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		char[] ch1 = s1.toCharArray();
		for(char c:ch1)
		{
			if(c == '(' | c ==')')
			{
				s2.append(c);
			}
		}
		String s3 = s2.toString();
		if(s3.startsWith(")") | s3.endsWith("(")|s3.length()%2!=0)
		{
			state = "WRANG";
		}
		else
		{
			for(int i = 0; i<s3.length();i++)
			{
				if(s3.charAt(i) == '(')
					num_l ++;
				else if(s3.charAt(i) == ')')
					num_r ++;
			}
			if (num_l == num_r)
				state = "RIGHT";
			else
				state = "WRONG";
		}
		System.out.println(state);
	}
}
