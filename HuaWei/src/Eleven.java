import java.util.Arrays;
import java.util.Scanner;


public class Eleven {
	int[] grade = new int[10];
	int aver = 0;
	int num = 0;
	int sum = 0;
	public void getAver()
	{
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<grade.length; i++)
		{
			grade[i] = scan.nextInt();
		}
		Arrays.sort(grade);
		if(grade[0] > 60)
			aver = 60;
		else{
			aver = (grade[4]/10)*10;
		}
		System.out.println(aver);
	}
}
