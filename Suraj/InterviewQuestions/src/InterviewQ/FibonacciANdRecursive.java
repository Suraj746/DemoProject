package InterviewQ;

import java.util.Scanner;

public class FibonacciANdRecursive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many fibonnaci numbers you want");
        int num=sc.nextInt();
//        for(int i=0; i<num; i++) {
//            int numbers1 = fibonacci(i);
//            System.out.println(numbers1);
//        }
        int factorialNumber=factorial(num);
        System.out.println("Factorial of "+num+": " + factorialNumber);
    }

    public static int fibonacci(int num){
        if(num==0){
            return 0;
        }
        if(num==1) {
           return 1;
        }
        if(num==2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    //factorial

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return num * factorial(num - 1);
        }
    }

}
