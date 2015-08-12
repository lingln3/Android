
public class Test6 {
//	int[][] waterDepth = new int[6][7];
	int[][] waterDepth={{0,1,2,2,3,0,0},
			{0,3,5,5,3,2,0},
			{0,1,4,6,7,3,0},
			{0,3,6,8,9,3,0},
			{0,2,4,5,5,2,0},
			{0,0,0,0,0,0,0}};
	int sum = 0;
	public void averDepth()
	{
		for (int i = 0; i < waterDepth.length;i++)
		{
			for(int j = 0 ; j < waterDepth[i].length;j++)
			{
				sum += waterDepth[i][j];
			}			
		}
		int aver = sum/(waterDepth.length*waterDepth[0].length);
		Test3.print("平均水深："+aver);
	}
}
