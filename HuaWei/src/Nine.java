
public class Nine {
	public int delete(String s)
	{
		int k = 0;
		boolean pan = false;
		int count = 0;
		int length = s.length();
		char[] ch ;
		for(int i = 0; i <= s.length()-2; i++)
		{
			for (int j = i+2; j<=s.length()-2; j++)
			{
				ch = s.toCharArray();
				if(s.charAt(i) == s.charAt(j))					
				{
					pan = true;
				}
				if(pan)
				{
					for(k = 1 ; j+k < length-1 && j - i >=2;k++)
					{
						if(s.charAt(i+k) != s.charAt(j+k))
						{
							k--;
//							i = i+k;
							pan = false;
							break;
						}
					}
				}
				if( k >=1 )
				{
					count++;
					String s2 =s.substring(j,j+k+1);
					s = s.substring(0,j)+s.substring(j+k+1);
					System.out.println(s2+","+k+","+j);
					ch = s.toCharArray();
					j--;
					k = 0;
				}
				pan = false;
			}
		}
		return count;
	}
}