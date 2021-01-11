package com.zoho;

import java.util.Scanner;


/*
1
1 1
2 1
1 2 1 1
1 1 1 2 2 1
3 1 2 2 1 1
1 3 1 1 2 2 2 1
1 1 1 3 2 1 3 2 1 1
3 1 1 3 1 2 1 1 1 3 1 2 2 1*/
public class Lookandsaysequence {
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Input=");
		int n=scan.nextInt();
		int m[]=new int[n*n];
		int m1[]=new int[n*n];
		int x=0,c=1,y=0;
		m[0]=1;
		System.out.println("1");
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<2*i;j++)
			{
				if(m[y]==m[j])
					c++;
				else
				{
					if(c==1)
						System.out.print(c+" "+m[y]+" ");
					else
						System.out.print(--c+" "+m[y]+" ");
					m1[x++]=c;
					m1[x++]=m[y];
					c=1;
					y=j--;
				}
			}
			for(int j=0;j<x;j++)
			{
				m[j]=m1[j];
			}
			System.out.println();
			x=y=0;
			c=1;
		}
		scan.close();
	}
}

