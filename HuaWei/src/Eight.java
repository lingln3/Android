import java.util.Arrays;
import java.util.Scanner;


public class Eight {
	/*
	 * ����һ�������170~190�䣨5����ߣ����Ƚ���߲ѡ����߲���С��2�����
	 * ����߲���ȣ�ѡƽ����߸ߵ���������ߣ���С�������
	 */
	Scanner scan = new Scanner(System.in);
	int[] height = new int[5];
	int[] height_dif = new int[4];
	int[][] dif = new int[10][10];
	int[] aver = new int[10];
	int[] equal = new int[10];
	int e = 0;
	int p = 0;
	int count = 0;
	public void getHeightDif()
	{	
		//��ȡ�������
		System.out.println("�����������170~190֮���5�����");
		for(int i = 0; i < height.length; i++)
		{
			height[i] = scan.nextInt();
		}
		Arrays.sort(height);
		for(int i = 0 ; i < height.length-1 ; i++)
		{
			height_dif[i] = height[i+1] - height[i];
		}
		int dif_min = 0;
		for(int j = 0 ; j < height_dif.length-1; j++)
		{
			if(height_dif[j] >= height_dif[j+1])
			{
				dif_min = j+1;				
			}
			else{				
				int temp = height_dif[j];
				height_dif[j] = height_dif[j+1];
				height_dif[j+1] = temp;
			}
		}
		System.out.println("��߲���С��"+height[dif_min]+","+height[dif_min+1]);
		/*
		for(int i = 0 ; i < height.length; i++)
		{
			int diff = 0;
			int diff2 = 0;
			for(int j = i+1 ; j < height.length; j++)
			{
				diff2 = Math.abs(height[j] - height[i]);
				dif[1][p] = diff2;
				dif[2][p] = i*10 + j;
				aver[p] = (height[j] + height[j+1])/2;
				p++;
			}			
		}
		for(int i = 0 ; i <p ; i++)
		{
			for(int j = i+1; j < p ; j++)
			{
				int temp = 0;
				int temp2 = 0;
				if(dif[1][i] > dif[1][j])
				{
					temp = dif[1][j];
					dif[1][j] = dif[1][j+i];
					dif[1][j+1] = temp;
					temp2 = dif[2][j];
					dif[2][j] = dif[2][j+1];
					dif[2][j+1] = temp2;
				}
				else if(dif[1][j] == dif[1][j+1])
				{
					equal[e] = j;
					e++;
				}
			}
		}
		for(int deng:equal)
		{
			
			if (deng != 0 ) count++; 
		}
		if(count > 0)
		{
			
		}
		else if(count == 0)
		{
			int num1 = dif[2][9]/10;
			int num2 = dif[2][9]%10;
			System.out.println(height[num1] + "," + height[num2]);
		}
		*/
	}
}
