import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Twenty {
	String str;
	int biaozhi = 1;
	List<Character> list = new ArrayList<Character>();
	public void match()
	{		
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		char[] ch = str.toCharArray();
		if(str.isEmpty())
		{
			biaozhi = 1;
		}
		else
		{
			for(int i = 0; i<str.length();i++)
			{
				switch(ch[i])
				{
				case '(':
					list.add(ch[i]);
					break;
				case '[':
					list.add(ch[i]);
					break;
				case ')':
				{
					find('(',ch);
					break;
				}
				case ']':
				{
					find('[',ch);
					break;
				}
				}
			}
		}
		if(list.size()>0)
		{
			biaozhi = 1;
		}
		else{
			biaozhi = 0;
		}
		System.out.println(biaozhi);
	}
	public void find(char c,char[] ch)
	{
		if(list.size() == 0)
		{
			biaozhi = 1;
		}
		else
		{
				if(list.contains(c))
				{
					int position = list.lastIndexOf(c);
					System.out.println(list.get(position));
					list.remove(position);
				}
				else{
					biaozhi = 1;
				}			
		}
	}
}