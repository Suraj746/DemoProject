package practice;

import java.util.Scanner;

//You are given an array A of size N a positive integer M.You have to make a frequency
// of elements with a frequency less than M equal to M.
//Problem statement: Minimum no of Operations
public class Logical2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int n=sc.nextInt();
		int k=0;
		int m=0;
		System.out.println("Enter number which is a power 2 or 3");
		int l=sc.nextInt();
		while(n!=k && k<n) {
			m++;
			if(l%2==0 || l%3==0) {
				k=k+l;
			}
		}
		if(n==k) {
			System.out.println("no of operation :"+m);
		}
		else {
			System.out.println("-1");
		}
	}

}
