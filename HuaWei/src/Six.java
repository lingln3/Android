
public class Six {
	int count = 0;//�������ճ��е�����
	/*
	 * Լɪ��
	 * n:������
	 * m:��m������
	 * k:��k����ʼ
	 */
	public void getNum(int n, int m,int k)
	{
		int p = 0; //���ڼ����ж��ٸ���0����
		int i = k-1;
		int[] arr = new int[n];
		for(int j = 0; j < n ; j++)
		{
			arr[j] = j+1;
		}
		while ((n-count)>(m-1))
		{
			for(; p<m ;)
			{
				if(i > n-1)
				{
					i = 0;
				}
				if(arr[i] != 0)
				{
					p++;
					i++;					
				}
				else{
					i++;
				}
			}
			arr[i-1] = 0;
//			System.out.println(i-1);
			count++;
			p = 0;
			/*
				//���ж�������±�
				if( (n-k+1) >= m)
				{
					i = k + m -2;
					arr[i] = 0;
					count++;
					i++;
				}
				else 
				{
					i = m - n + k -2;
					arr[i] = 0;
					count++;
					i++;
				}
				
			}
			if(p < m)
			{				
				if(arr[i] != 0)
				{			
					p++;
				}
			}
			else
			{
				
			}
			else
			{
				
			}*/
		}
		for(int q = 0 ; q<n; q++)
		{
			if(arr[q] == 0)
			{
				System.out.println(q+1);
			}
		}
		System.out.println(count);
		/*
		for(int i = k ; i < n ; i++)
		{
			if( (n-k+1) >= m)
			{
				arr[i ] = 0;
			}
			else 
			{
				i = m - n + k -2;
			}*/
		}
	
}