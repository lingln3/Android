
public class Test5 {
	float sheep[]={30,31.5f,32,41.2f,27.8f,21.5f,26,11.7f,12,
			18.4f,15,30.4f,20,27,43,37,27,14,10.4f,31.4f,14.5f,
			27.5f,12f,20,28.5f,25.8f,41.2f,32,31.5f,30};
	/*
	 * 第0只羊：26.0，第1只羊：27.0，第2只羊：27.0，第3只羊：27.5，
	 * 第4只羊：27.8，第5只羊：28.5，第6只羊：30.0，第7只羊：30.4，
	 * 第8只羊：31.5，第9只羊：32.0，第10只羊：32.0，第11只羊：37.0，
	 * 第12只羊：41.2，第13只羊：41.2，第14只羊：43.0，sum = 750.0
	 */
	int num = sheep.length;
	float awardSheep[] = new float[15];
	float sum = 0;
	float aveWeight = 0;
	
	public void SumAve(){
		for(int i=0; i < num; i++ )
	{
		sum += sheep[i]; 
	}
		aveWeight = sum/num;
	}
		
	public void AwardSh()
	{
		int j = 0;
		for(int i = 0 ; i< num;i++)
		{
			if(sheep[i]>=aveWeight)
			{				
				awardSheep[j] = sheep[i];
				j++;
				if (j == 15) break;
			}
		}
	}
	
	public void paixun()
	{
		float temp = 0;
		for(int i = 0 ; i < 15; i++)
		{
			for(int j = i+1; j <15; j++)
			{
				if(awardSheep[i]>awardSheep[j])
				{
					/*将15只羊按从小到大的顺序排列，从第一只羊开始比较，如果比
					 * 后面第j只养大，则将2只交换					 * 
					 */
					temp = awardSheep[i];
					awardSheep[i] = awardSheep[j];
					awardSheep[j] = temp;
				}
			}
		}
	}
	
	public void fenjiang()
	{
		float[][] fen = new float[3][5];
		try{
		for(int i =0; i <fen.length;i++)
		{
			Test3.println("第一人的奖品：");
			for(int j = 0; j<fen[i].length; j++)
			{
				//fen[i][j] = awardSheep[14-5*i-j];
				fen[i][j] = sheep[15+i*5+j];
				Test3.println("羊："+fen[i][j]);
			}
		}
		}catch(Exception e)
		{
			System.out.println("exception");
		}
	}
}
