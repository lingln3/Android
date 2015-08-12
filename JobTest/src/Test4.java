
public class Test4 {
	Test4(int layer){
		for(int i = 1;i <= layer; i++)
		{
			for(int j = 1; j <= layer-i; j++)
			{
				Test3.print(" ");
			}
			for(int k = 1; k <= i ; k++)
			{
				Test3.print("*");
				Test3.print(" ");
			}
			
			Test3.println("");
		}
	}
}
