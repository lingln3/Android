import java.util.Scanner;


public class Ten {
	
	public void add(char[] num1,char[] num2, char[] result)
	{
		String s1 = new String(num1);
		String s2 = new String(num2);
//		Scanner sc = new Scanner(System.in);
//		num1 = sc.nextLine().toCharArray();
//		num2 = sc.nextLine().toCharArray();
		if(num1[0] != '-' && num2[0]!='-')
		{
			//均为正数
//			String s1 = new String(num1);
//			String s2 = new String(num2);
//			System.out.println(s1+","+s2);			
			int i1 = Integer.parseInt(s1);
			int i2 = Integer.parseInt(s2);
			int sum = i1+ i2;
			result = String.valueOf(sum).toCharArray();
		}
		else if(num1[0] =='-' && num2[0]!='-')
		{
			//num1为负，num2为正数
			s1 = s1.substring(1);
			int i1 = Integer.parseInt(s1);
			int i2 = Integer.parseInt(s2);
			int sum = i2 - i1;
			result = String.valueOf(sum).toCharArray();
		}
		else if(num1[0] !='-' && num2[0] =='-')
		{
			//num2为负，num1为正数
			s2 = s2.substring(1);
			int i1 = Integer.parseInt(s1);
			int i2 = Integer.parseInt(s2);
			int sum = i1 - i2;
			result = String.valueOf(sum).toCharArray();
		}
		else if(num1[0] == '-' && num2[0] =='-')
		{
			//num1为负，num2为正数
			s1 = s1.substring(1);
			s2 = s2.substring(1);
			int i1 = Integer.parseInt(s1);
			int i2 = Integer.parseInt(s2);
			int sum = -(i1 + i2);
			result = String.valueOf(sum).toCharArray();
		}
		String s = new String(result);
		System.out.print(s);
	}

	
}
