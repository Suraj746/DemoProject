package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sumofanumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to check it is palindrome or not");
		int num=sc.nextInt();
		int sum=0,rem,temp;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
		
		List<Integer> li=Arrays.asList(43,33,54,10,12);
//		Collections.sort(li);
		System.out.println(li);
		System.out.println("Sorted");
		
		//Sort bubble sort
		int temp2;
		for(int i=0;i<li.size()-1;i++) {
			for(int j=0;j<li.size()-1;j++) {
				if(li.get(j)>li.get(j+1)) {
					temp=li.get(j);
					li.set(j,li.get(j+1));
					li.set(j+1, temp);
				}
			}
		}
		System.out.println(li);
		
		
		//Reverse a number
		int number=153;
		System.out.println(number);
		int sumof=0;
		int remainder=0;
		while(number>0) {
			remainder=number%10;
			sumof=sumof* 10 + remainder;
			number=number/10;
			
		}
		System.out.println("Reversed number is "+sumof);
		
		//removing duplicate elements
		int[] arr= {1,1,2,2,3,3,4,4,4,5,5,5};
		System.out.println("Before removing duplicate element"+arr);
		int temparr[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temparr[j]=arr[i];
				j++;
			}
		}
		temparr[j]=arr[arr.length-1];
		System.out.println("Removed duplicate elements");
		for (int i : temparr) {
			System.out.println(i);
		}
		
//		reverse a sentence
		String name="My name is Suraj Pradhan";
		System.out.println(name);
		System.out.println("String length"+name.length());
		System.out.println("Reversed");
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
			
		}
		
	}

}
