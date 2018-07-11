package com.jda.core;
import com.jda.utility.FunUtility;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Coupons {

public static void main(String args[])
{
		System.out.println("Enter the number of coupons ");
		int number = FunUtility.getInt();
		int Generated;
		Boolean check;
		int count = 0;
		Random rand = new Random();
		
		List<Integer> coupons = new ArrayList<>();
		while (coupons.size() < number) 
		{
			check = false;
			Generated = rand.nextInt(5*number);
			count++;
			for (int x : coupons) {
				if (Generated == x) {
					check = true;
					break;
				}
			}
			if (check == false) {
				coupons.add(Generated);
			}
		}
		System.out.println("The coupons are :\n"+ coupons);
		/*for (int coupon : coupons) {
			System.out.println(coupon);
		}*/		System.out.println("Finanl count of coupons generated is " + count);
	}
}



