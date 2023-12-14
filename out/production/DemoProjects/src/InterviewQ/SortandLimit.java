package InterviewQ;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Sort a list of strings in alphabetical order and return the first three elements using Streams.

public class SortandLimit {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Fig");

        List<String> sortedAndLimited = strings.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());  // In Java 16+, you can use the toList() method to collect the results.

        sortedAndLimited.forEach(System.out::println);
    }
}

