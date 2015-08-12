import java.util.Scanner;


public class Four {
	public void stringZip()
	{
		String InputStr;
		long InputLen;
		String outputStr;
		System.out.println("inputstring");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		InputStr = scan.next();
		InputLen = InputStr.length();
		int count = 1;
		int index = 0;
		char[] ch = InputStr.toCharArray();
		for(int i = 0 ; i < (InputStr.length()-1);)
		{
			while(index != -1)
			{
				ch = InputStr.toCharArray();
				if( i == InputStr.length()-1)
				{
					i++;
					break;
				}
				else if(InputStr.charAt(i) != InputStr.charAt(i+1) 
						&& i != InputStr.length()-1){
					index = -1;
					i++;
				}
				else
				{
//					InputStr =InputStr.substring(0,i)+InputStr.substring(i+1);
					count++;					
					i++;
//					System.out.println(InputStr + "  " + count);
				}
			}
			if(count == 1)
			{
				/*InputStr = InputStr.substring(0,i)+InputStr.charAt(i) +InputStr.substring(i+1);
				i++;*/
			}
			else{
				/*InputStr = InputStr.substring(0,i)+String.valueOf(count) + InputStr.charAt(i) +InputStr.substring(i+1);
				i = i+2;*/
				int position = i - count;
				InputStr = InputStr.substring(0,position)+String.valueOf(count) + InputStr.charAt(position) +InputStr.substring(i);
				i = i - (count - 2);
			}
			System.out.println(InputStr);
			count = 1;
			index = 0;
//			s = s.substring(0,)
		}
	}
}
