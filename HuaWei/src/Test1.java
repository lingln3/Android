import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


public class Test1 {
	private int[] arr = new int[5];
	int max = 0;
	int min = 0;
	public void getFromTab()
	{
		//��ȡ��������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//forѭ����������
		for(int i = 0; i<arr.length;i++)
		{
			min = arr[0];
			try
			{
				System.out.println("�������"+(i+1)+"����");
				//�������ַ�ת����ʮ����������������
				arr[i] = Integer.parseInt(br.readLine());
			}catch(IOException e)
			{
				e.printStackTrace();
			}
			if(arr[i] > max)
			{
				max = arr[i];
			}
			if(arr[i]<min)
			{
				min = arr[i];
			}
			
		}
		System.out.println("max: "+ max + "min: "+min);
	}
	
	public void getScanner()
	{		
		Scanner scan = new Scanner(System.in);
		System.out.println("��Ӽ���������5����");
		for(int i = 0 ; i<5; i++)
		{
			arr[i] = scan.nextInt();
			if(max < arr[i])
			{
				max = arr[i];
			}
			if(min > arr[i])
			{
				min =arr[i];
			}
		}
		Arrays.sort(arr);
		System.out.println("��������飺");
		for(int j = 0 ; j<5; j++)
		{
			if(j ==4 )
			{
				System.out.print(arr[j]);
			}
			else{
			System.out.print(arr[j]+",");
			}
		}
	}
	
	public void getUnkownLength()
	{
		int[] arr2 ;
		int n;
		Scanner scan = new Scanner(System.in);		
		System.out.println("���������鳤�ȣ�");
		n = scan.nextInt();
		arr2 = new int[n];
		System.out.println("������"+n+"����");
		for(int i = 0 ; i < n; i++)
		{
			arr2[i] = scan.nextInt();
		}
		Arrays.sort(arr2);
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr2[i]+",");
		}
	}
	
	public void getStringToInt()
	{
		String s = "11.65.27.100";
		int result[] = new int[4];
		int[] num = new int[5];
		num[0] = -1;
		num[4] = s.length();
		char c = s.charAt(3);
		System.out.println(c);
		int index = 0;
		char ch[] = s.toCharArray();
		for(int i = 1 ; i<num.length-1;i++)
		{
			index = s.indexOf(".",index+1);
			num[i] = index;
			System.out.println(index);
		}
		for(int i = 0 ;i < result.length;i++)
		{
			int low = num[i], hi = num[i+1];
			int weishu = hi-low-1;
			
			switch(weishu)
			{
			case 1:
				result[i] = ch[low+1]-'0';
			case 2:
				result[i] = (ch[low+1]-'0')*10 + (ch[low+2]-'0');
			case 3:
				result[i] = (ch[low+1]-'0')*100 + (ch[low+2]-'0')*10 + ch[low+3]-'0';
				default:					
			}
			System.out.println(result[i]+","+weishu+","+((ch[low+1]-'0')*10+(ch[low+2]-'0')));
		}
	}
	
	public void getStringToInt2()
	{
		String s = "11.65.27.100,123 55 33:33|22";
		String[] s1 = s.split("[\\.| |,|\\||:]");
	    int[] int_string = new int[s1.length]; 
		for(String str:s1)
		{
			System.out.println(str);
		}
		for(int i = 0 ; i < s1.length; i++)
		{
			int_string[i] = Integer.parseInt(s1[i]);
			System.out.println(int_string[i]);
		}
	}
}