package InterviewQ;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to calculate the ocurrance");
        String str=sc.next();
        String str2="5,5,1,2,2,3,4,5,0,4,5";
        String[] occurance=str2.split(",");
        Stream<Object> stream = Arrays.stream(occurance);
        Map<Object, Long> collect1 = stream.sorted().collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
        collect1.forEach((k,v) -> System.out.println("Key: " + k + "Value: " + v));


        String inputString = "suraj pradhan";
        System.out.println("Repetating characters");
        inputString.chars().mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(map -> map.getValue() > 1)
                .map(Map.Entry::getKey).forEach(System.out::println);

        System.out.println("Non Repeatating characters");
        inputString.chars().mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(map -> map.getValue() == 1)
                .map(Map.Entry::getKey).forEach(System.out::println);

    }
}
