import java.util.Arrays;
import java.util.Scanner;


public class Twelve {
	int count = 0;
	int n = 0;
	public void light()
	{
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		boolean[] state = new boolean[n];
		Arrays.asList(state,false);
		for(int i= 1; i<n+1;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				if(i%j == 0)
				{
					state[i-1] = !state[i-1];	
//					System.out.print(j +" ");				
				}
			}
			
		}
		for(int i = 0; i <n; i++)
		{
			if(state[i] == true)
			{
				count++;
				System.out.print((i+1)+" ");
			}
		}
	}
}
