package com.jda.core;
import com.jda.utility.FunUtility;

public class Triplet {
	public static int sum(int a)
	{
		int addition = 0;
		while(a/10>0)
		{ addition = addition + (a%10) ;
		a=a/10;	}
	    addition+=a;
	    return addition;
	    }
	public static void main(String args[])
	{ int j=0;
	System.out.println("How many numbers are you gonna enter dickhead");

int numbers = FunUtility.getInt();
int array1[] = new int[numbers] ;
int array2[] = new int[numbers] ;
System.out.println("enter the fucking no.s");
	for(int i=0;i<numbers;i++)
	{ 
		int h = FunUtility.getInt();
		int k = sum(h);
      if (k==10)
    	  {
    	  array2[j]=h;
    	  j++ ;
    	  }
    }
	System.out.println("Amount of no. which add to 10 is " + (j));
	System.out.println("The numbers which add to 10 are " );
	for(int i=0;i<j;i++)
	{System.out.println(array2[i]);
}
}
}