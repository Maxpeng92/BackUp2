package javaProject1;

import java.util.Arrays;

public class Atest{
    static final int Y = 365;
    static int a = 9;
    private static float numb = 3.0f;
	public static void main(String[] args) {
		int c,b;
		int l[] = {1,2,3,4,5,6};
		c=12;b=4;
		boolean status = 8!=0;
		for (int i=0;i<4;i++)
		{
			System.out.print("i = "+i+". ");
			System.out.println("x * x = "+(i*i));
			if (i==3) System.out.println("the total days of a year is "+Y);
			if (i<3) 
				a--;
			else
				System.out.println("a is "+a);
		}
		System.out.println(Integer.MAX_VALUE);
		if (a>0) System.out.println(status);
		System.out.println(numb);
		c*=++b;
		int maxn = (a>b)? a:b;
		System.out.println(c);
		System.out.println(b);
		System.out.println(maxn);
		String q = "bad";
		switch (q)
		{ case "dad": System.out.println(maxn);
		  break;
		  case "bad": System.out.println("got it");
		  break;
		  default: System.out.println("none!");
		}
		int j = 0,max,min;
		max=min=l[0];
		System.out.println("list includes elements: ");
        for (int w=0;w<l.length;w++)
        {
        	System.out.print(l[w]+" ");
        	if(l[w]>max)
        		max = l[w];
        	else if(l[w]<min)
        		min = l[w];
        }
        System.out.println("\n"+max);
        System.out.println(min);
		do
		{ j++;
		  for (int k=0;k<2;k++)
		  {
			  System.out.println("rich");
		  }
		  System.out.println("i love java!");
		}
		while (j<5);
		int l1[] = {1,2,3,4,5,6};
		int l2[] = {9,8,7,6,5,4,3};
		System.arraycopy(l1, 1, l2, 0, 4);
		for (int i=0;i<l1.length;i++)
			System.out.print(l1[i]+" ");
		System.out.println();
		for (int i=0;i<l2.length;i++)
			System.out.print(l2[i]+" ");
		System.out.println();
		Arrays.sort(l2);
		for (int i=0;i<l2.length;i++)
			System.out.print(" "+l2[i]);
		int dl[][];
		dl = new int[2][4];
		int dl1[][] = {
				{23,45,21,45},
				{45,23,46,23}
		};
		int dl2[][] = {
				{1,2,3},
				{4},
				{6,2,5,6}
		};
		System.out.println();
		int sum = 0;
		for (int i=0;i<dl1.length;i++)
		{
			System.out.print("The "+(i+1)+" line: ");
			for (int k=0;k<dl1[i].length;k++)
			{
				System.out.print(dl1[i][k]+" ");
				sum += dl1[i][k];
			}
			System.out.println();
			System.out.println("Total is "+sum);
			sum = 0;
		}
		System.out.println(sum);
		int A[][][] = {{{1,2},{3,6}},{{3,5},{8,7}}};
		for (int i=0;i<A.length;i++)
			for (int k=0;k<A[i].length;k++)
			{
				System.out.print("The "+(i+1)+"and "+(k+1)+": ");
				for (int w=0;w<A[k].length;w++)
				{
					System.out.print(A[i][k][w]+" ");
					sum += A[i][k][w];
				}
				System.out.println();
			}
		System.out.println("the total is: "+sum);
	}
}