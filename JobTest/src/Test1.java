import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;


public class Test1 extends Test2{
	
	/*static{
		Test3.println("static code Test1");
	}*/
	public static void main(String[] args) throws IOException{
		
//		Test3.println("���������������");
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		int[] in = new int[1024]; 
//		Test5 test5 = new Test5();
//		float[][] a = new float[3][5];
//		Test3.print("��ά����"+a.length);
		/*
		test5.SumAve();
		test5.AwardSh();
		test5.paixun();
		for(int  i =0; i<15; i++)
		{
			Test3.print("��"+i+"ֻ��"+test5.awardSheep[i]+"��");
		}
		Test3.println("sum = "+ test5.sum);
		Test3.println("ave= " + test5.aveWeight);
		*/
		/*
		Arrays.sort(test5.sheep);
		for(int i = 0; i<test5.sheep.length;i++)
		{
			Test3.print("��"+i+"ֻ��"+test5.sheep[i]+"��");
		}
		*/
		/*
		Arrays.sort(test5.sheep);
		Test3.print("hello");
		int result = Arrays.binarySearch(test5.sheep, 5);
		if(result == -1)
		{
			Test3.print("û�и���");
		}
		else{
			Test3.print("�ڵ�"+result+"��λ��");
		}*/
//		test5.fenjiang();
		
		/*
		test5.SumAve();
		test5.AwardSh();
		test5.paixun();
		test5.fenjiang();
		*/
		/*
		Test6 test6 = new Test6();
		test6.averDepth();
		int a[] = {1,2,3};
		a = new int[5];
		Test3.println(a[1]);
		int b[][] = {{1,2},{5,3,4}},i,j;
		for(i = 0 ; i<2; i++)
		{
			for(j = 0 ; j <3; j++)
			{
				Test3.println(b[i][j]);
			}
		}
		*/
		/*Test8 test8 = new Test8();
		Test9 test9 = new Test9();
		Test8 test81 = new Test9();		
		Test8 test82 = new Test8();
		test8.eat();//fa
		test9.eat();//son
		test9.eat("hh");//hh
		test81.eat();//son
		test8.eat();
		test82.eat();
		test8.eat();*/
		/*
		Test10 test10 = Test10.getTest10();
		Test10 test11 = Test10.getTest10();
		Test3.println(Test10.b);
		Test3.println(Test10.b);
		*/
		/*
		Test11 test11 = Test11.getTest11();
		test11.Fibonacci(10);
		test11.Fibonacci_even(10);*/
		/*Test12 test12 = new Test12();
		test12.Pant();
		Test8 test8 = new Test9();
		System.out.println(test8.c);
		System.out.println(test8.returnC());
		Test7 test7 = new Test7();
		Test7.Test71 test71 = test7.new Test71();*/
	/*	Test13 test13 = new Test13();
		 
		int suzu[] = {3,2,4,5,6,1,8,9,33,12,43,10,11,32,15};
		Test13[] test131 = test13.sort_num(suzu);
		Arrays.sort(test131);
		System.out.println(test131[3].num+","+test131[3].no);
		*/
		/*Test1 test1 = new Test1(); 
		for(Test14 test:Test14.values())
		{
			System.out.print(test+","+test.ordinal()+",");
			test1.out(test);
		}*/
		/*ArrayList apple = new ArrayList();
		for(int i = 0 ; i<4 ; i++)
		{
			apple.add(new Apple());
		}
		for(int i = 0 ; i< apple.size(); i++)
		{
			long num = 0;
			num = ((Apple) apple.get(i)).id();
			System.out.println(num);
		}*/
		/*ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		for(int i = 0 ; i<4; i++)
		{
			gerbils.add(new Gerbil());
		}
		for(Gerbil g:gerbils)
		{
			g.hop();
		}*/
		/*Collection<Integer> c = new ArrayList<Integer>();
		for(int i = 0 ; i<10; i++)
		{
			c.add(i);
		}
		for(Integer in:c)
		{
			System.out.println(in);
		}*/
		/*Set<Integer> c = new HashSet<Integer>();
		for(int i = 0 ;i < 10; i++)
		{
			c.add(i);
		}
		System.out.println(c);*/
		/*Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
//		System.out.println(collection);
		for(Integer in:collection)
		{
			System.out.println(in);
		}
		Integer[] moreInts = {6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, 11,12,13,14,15);
		Collections.addAll(collection,moreInts);
		System.out.println(collection);*/
		/*Test15 test15 = new Test15();
		test15.test();*/
		CollectClass col = new CollectClass();
		col.print(col.fill(new ArrayList()));
		col.print(col.fill(new LinkedList()));
		col.print(col.fill(new LinkedHashSet()));
		
		col.print(col.fill(new TreeSet()));
		col.print(col.fill(new HashMap<String,String>()));
	}
	
	public void out(Test14 test)
	{
		switch(test){
		case MAO:
			System.out.println(0.5);
			break;
		case ONE:
			System.out.println(+1);
			break;
		case FIVE:
			System.out.println(+5);
			break;
		case TEN:
			System.out.println(+10);
			break;
		case TWEN:
			System.out.println(+20);
			break;
		case FIFTY:
			System.out.println(+50);
			break;
		}
	}
}


