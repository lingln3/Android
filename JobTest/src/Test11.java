
public class Test11 {
	//Fibonacci Saguence
	private static Test11 instance = new Test11();
	static int[] fibo;
	public static Test11 getTest11(){
		return instance;
	}
	public void Fibonacci(int n){
		fibo = new int[n];
		fibo[0] = 1;
		fibo[1] = 1;
		System.out.println(fibo[0]);
		System.out.println(fibo[1]);
		for(int i = 2; i <n; i++)
		{
			fibo[i] = fibo[i-1] + fibo[i-2];
			System.out.println(fibo[i]);
		}
	}
	public void Fibonacci_even(int n){
		fibo = new int[n];
		fibo[0] = 1;
		fibo[1] = 1;
		System.out.println(fibo[0]);
		System.out.println(fibo[1]);
		for(int i = 2; i <n; i++)
		{
			fibo[i] = fibo[i-1] + fibo[i-2];
			if(fibo[i]%2 == 0)
			{
				System.out.println(fibo[i]+"*");				
			}
			else
			{
				System.out.println(fibo[i]);
			}
		}
	}
	private Test11(){
		
	}
}
