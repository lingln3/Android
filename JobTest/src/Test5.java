
public class Test5 {
	float sheep[]={30,31.5f,32,41.2f,27.8f,21.5f,26,11.7f,12,
			18.4f,15,30.4f,20,27,43,37,27,14,10.4f,31.4f,14.5f,
			27.5f,12f,20,28.5f,25.8f,41.2f,32,31.5f,30};
	/*
	 * ��0ֻ��26.0����1ֻ��27.0����2ֻ��27.0����3ֻ��27.5��
	 * ��4ֻ��27.8����5ֻ��28.5����6ֻ��30.0����7ֻ��30.4��
	 * ��8ֻ��31.5����9ֻ��32.0����10ֻ��32.0����11ֻ��37.0��
	 * ��12ֻ��41.2����13ֻ��41.2����14ֻ��43.0��sum = 750.0
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
					/*��15ֻ�򰴴�С�����˳�����У��ӵ�һֻ��ʼ�Ƚϣ������
					 * �����jֻ������2ֻ����					 * 
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
			Test3.println("��һ�˵Ľ�Ʒ��");
			for(int j = 0; j<fen[i].length; j++)
			{
				//fen[i][j] = awardSheep[14-5*i-j];
				fen[i][j] = sheep[15+i*5+j];
				Test3.println("��"+fen[i][j]);
			}
		}
		}catch(Exception e)
		{
			System.out.println("exception");
		}
	}
}
