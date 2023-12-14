package StreamAPi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostAskedInterview {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,4,5,6,7,89,4,5,6,89,102);
        Map<Integer, Long> collectNumbers = numbers.stream().collect(Collectors.
                groupingBy(Function.identity(), Collectors.counting()));
        collectNumbers.forEach((key, value) -> System.out.println(key + "=" + value));


        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        distinctNumbers.forEach(System.out::println);


        //distinct numbers
        Map<Integer, Long> collectDistinctNumbers = numbers.stream().distinct().collect(Collectors.
                groupingBy(Function.identity(), Collectors.counting()));
        collectDistinctNumbers.forEach((key, value) -> System.out.println(key + "=" + value));

        List<String> strings=Arrays.asList("Suraj","Pradhan","Suraj","Ram","Shyam","Ram");
        Map<String, Long> collect1 = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect1.forEach((key, value) -> System.out.println(key + "=" + value));

    }
}
