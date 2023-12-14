package practice;

import java.util.Scanner;

public class Largestdigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mobile number");
		long num=sc.nextLong();
		long rem,large=0;
		while(num>0) {
			rem=num%10;
		
		if(large<rem) {
			large=rem;
		}
		num=num/10;
		}
		System.out.println("Largest number in my mobile number is : "+large);
		String s="Suraj";
		String reverse= new StringBuilder(s).reverse().toString();
		System.out.println(reverse);
		float x=5/2;
		System.out.println(x);
	}

}
