import java.util.Arrays;
import java.util.Scanner;


public class TwentyOne {
	String s1,s2,s3;
	String[] array,array2;
	StringBuilder build = new StringBuilder();
	public void sort()
	{
		Scanner scan = new Scanner(System.in);
		s1 = scan.nextLine();
		s2 = scan.nextLine();
//		System.out.println(s1);
		array=s1.split(" ");
//		for(String str:array)
//		{
//			System.out.println(str);
//		}
		array2 = new String[array.length];
		for(int i = 0; i < array.length;i++)
		{
			if(array[i].contains(s2))
			{				
				build.append(array[i]);
				build.append(" ");
			}
		}
//		s3 = Arrays.toString(build);
		System.out.print(build.toString().trim());
	}
	
}
