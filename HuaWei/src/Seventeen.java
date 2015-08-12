import java.util.Arrays;
import java.util.Scanner;


public class Seventeen {
	int[] array;
	String s1;
	int count = 0;
	public void find()
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		for(int i= 0 ; i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
			{
				s1 = s.replaceAll(" ", "");
			}
		}
		char[] ch = s1.toCharArray();
		array = new int[s1.length()];
		for(int i = 0; i<s1.length(); i++)
		{
			array[i] = ch[i] - '0';
		}
		Arrays.sort(array);
		for(int i = 0; i < array.length-1&& count<2;i++)
		{
			if(array[i] == array[i+1])
			{
				i++;
			}
			else{
				count++;
				System.out.print(array[i] + " ");
			}				
		}
		if(count<2)
		{
			System.out.print(array[array.length-1]);
		}
	}
}
