package practice;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to check it is palindrome or not");
		int num=sc.nextInt();
		int sum=0,rem,temp;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not a palindrome number");
		}
	}

}
