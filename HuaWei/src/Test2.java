import java.util.Scanner;


public class Test2 {
	public void three()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ��Сд��ĸ�ַ���");
		String s = scan.next();
		System.out.println(s);
		for(int i = 0; i<s.length()-1; i++)
		{
			int index;			
			char[] ch = s.toCharArray();
			index = s.indexOf(ch[i],i+1);
			System.out.println(index);
			while(index != -1)
			{
				s = s.substring(0,index) + s.substring(index+1);
				ch = s.toCharArray();
				index = s.indexOf(ch[i],i+1);
				System.out.println(i+ "  "+ index+ "    " + s);
			}
			/*
			do
			{
				ch = s.toCharArray();
				index = s.indexOf(ch[i],i+1);
				s = s.substring(0,index-1) + s.substring(index+1);
				System.out.println(i+ "  "+ index+ "    " + s);
			}while(index != -1);*/
			/*
			for(int k = i+1; k < s.length()-1 ; k++)
			{
				char[] ch = s.toCharArray();
			int j = s.indexOf(ch[k],k+1);		
			s = s.substring(0,j-1) + s.substring(j+1);
			}*/
		}
		System.out.println(s);
	}
}