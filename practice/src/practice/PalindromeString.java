package practice;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check it is palindrome or not ");
		String s=sc.next();
		for(int i=s.length()-1;i>=0;i--) {
//			System.out.print(s.charAt(i));
			reverse=reverse + s.charAt(i);
//			reverse=reverse + s.toLowerCase().charAt(i);
		}
		System.out.println(reverse);
		if(s.equals(reverse)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
