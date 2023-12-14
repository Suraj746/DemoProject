package InterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ErrorHandlingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, -4, 5, -6, 7);

        List<Integer> squaredNumbers = numbers.stream()
            .map(number -> {
                try {
                    if (number < 0) {
                        throw new IllegalArgumentException("Negative number not allowed.");
                    }
                    return number * number;
                } catch (IllegalArgumentException e) {
                    System.err.println("Exception: " + e.getMessage());
                    return 0; // Handle the exception and return a default value.
                }
            })
            .collect(Collectors.toList());

        squaredNumbers.forEach(System.out::println);
    }
}

