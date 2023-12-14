package practice;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check the number is prime or not ");
		int num=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=true;
			}
		}
		if(!flag) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}

}
