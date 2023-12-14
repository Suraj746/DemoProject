package StreamAPi;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Sequential stream processing
        long sequentialSumOfSquares = numbers.stream()
                .mapToLong(n -> square(n))
                .sum();

        System.out.println("Sequential Sum of Squares: " + sequentialSumOfSquares);

        // Parallel stream processing
        long parallelSumOfSquares = numbers.parallelStream()  // Use parallel() to enable parallel processing
                .mapToLong(n -> square(n))
                .sum();

        System.out.println("Parallel Sum of Squares: " + parallelSumOfSquares);
    }

    private static long square(int number) {
        // Simulate a time-consuming operation
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return number * number;
    }
}

