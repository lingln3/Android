import java.util.Arrays;
import java.util.Scanner;


public class Eight {
	/*
	 * 输入一组身高在170~190间（5个身高），比较身高差，选出身高差最小的2个身高
	 * 若身高差相等，选平均身高高的那两个身高；从小到大输出
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
		//获取身高数组
		System.out.println("请输入身高在170~190之间的5个身高");
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
		System.out.println("身高差最小："+height[dif_min]+","+height[dif_min+1]);
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
