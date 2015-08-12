import java.util.Arrays;

public class Test2 {
	
	static int cc = 6;
	

	static{
		Test3.println("static code Test2");
	}
	
	protected int a=0,b=0;
	private static int c = 9;	
	Test2(){
		Test3.println("TEST2");
	}

	//	public Test2(int m,int n){
//		
//		boolean stat = true;
//		int size = n-m+1;
//		boolean[] status =new boolean[size];	
//		Arrays.fill(status, true);
//		for(int j = m ; j <= n ;j++)
//		{
//			
//			for(int k = j; k <= n; k++)
//			{
//				
//				if(k%j == 0)
//				{
//					status[k-m] = !status[k-m];
//				}
//			}
//			if(status[j-m] == true)
//			{
//				System.out.println(j+":true");				
//			}
//			else
//			{
//				System.out.println(j+":false");
//			}
//		}
//		
//	}
	private void Test3(){
		
	}

	public void Test33(){
		
	}
	private static void Test31(){
		
	}

	public static void Test331(){
		
	}
	protected static void Test(){
		System.out.println("false");
	}
	
	protected void Test4(int m,int n){
		System.out.println("false");
	}
	
	void fun(){
		System.out.print(cc);
	}
	
}
