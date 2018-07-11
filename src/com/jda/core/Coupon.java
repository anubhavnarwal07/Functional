package com.jda.core;
import java.util.Random;
import com.jda.utility.FunctionalUtility;
public class Coupon {
	public static void main(String args[])
	{
	int found=0;
	
	int times = FunctionalUtility.getInt() ;
	int old[] = new int[times];
	int arra[] = new int[times+1];
	for(int i=1;i<=times;i++)
	{ arra[i] = FunctionalUtility.getInt();
System.out.println(arra[i]);
	}
	int count = 0;
Random r = new Random();
while(found!=times)
{ int generated = r.nextInt(10);
count+=1;

for(int i=0;i<times;i++)
{if(arra[i]==generated) 
	found = found + 1; 

 
}
	}
System.out.println(count);
}

}