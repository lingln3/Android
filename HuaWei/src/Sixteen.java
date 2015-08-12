import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sixteen {
	List<Integer> list = new ArrayList<Integer>();
	public void find()
	{
		boolean biaozhi = true;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] ch = str.toCharArray();		
		for(int i = 0 ; i<str.length()&&biaozhi;i++)
		{
			for(int j = i+1; j<str.length();j++)
			{
				if(ch[i] == ch[j])
				{
					break;
				}
				else if(j==str.length()-1)
				{
					int temp = ch[i] - '0';
					biaozhi = false;
					System.out.println(temp);
				}
				
			}
		}
		
		
	}
}
