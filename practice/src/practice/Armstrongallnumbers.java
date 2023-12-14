package practice;

import java.util.Scanner;

//Armstrong any number
public class Armstrongallnumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check it is palindrome or not");
		int number=sc.nextInt();
		int temp,rem,result=0,n=0;
		temp=number;
		for(;temp!=0;temp/=10,++n);
		temp=number;
		for(;temp!=0;temp/=10) {
			rem=temp%10;
			result +=Math.pow(rem, n);
		}
		if(result==number) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not a armstrong number");
		}
		
		
	}

}
