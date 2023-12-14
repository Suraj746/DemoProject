package practice;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check armstrong or not");
		int num=sc.nextInt();
		int temp,rem,sum=0;
		temp=num;
		while(num!=0) {
			rem=num%10;
			sum +=Math.pow(rem, 3);
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("Armstrong number");
			
		}
		else {
			System.out.println("Not a armstrong number");
		}
	}

}
