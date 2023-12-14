package practice;
//best logical question
import java.util.Arrays;
import java.util.Scanner;

public class Logical
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size");
        int N = in.nextInt();
        int []A = new int[N];
        // input N and array
        System.out.println("Enter array elements");
        for (int i = 0; i < N; i++)
        {
            A[i] = in.nextInt();
        }
        // create another array that will be sorted
        int[] copyA = Arrays.copyOf(A, N);
        // sort the array (arrange height wise)
        Arrays.sort(copyA);
        for (int i = 0; i < N; i++) {
            // check for wrong positions and print their indices
            if (A[i] != copyA[i])
                System.out.print(i + " ");
        }
    }
}
