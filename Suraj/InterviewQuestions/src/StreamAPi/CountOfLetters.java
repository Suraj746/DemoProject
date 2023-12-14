package StreamAPi;

import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class CountOfLetters {
    public static void main(String[] args) {
        //First Vowels Count of letters in a String
        String str= "My name is Suraj Pradhan and i am the java developer and angular developer";
        long countnoofVowels = str.chars().filter((x) -> {
            return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x =='A' || x == 'E' || x == 'I' || x == 'O' || x == 'U' || x == 'U');
        }).count();
        System.out.println(countnoofVowels);

        //Str.chars()
        //Duplicate characters find in the string
        Map<String, Long> duplicateElements = str.chars().mapToObj((x) -> (char) x).collect(Collectors.groupingBy(Objects::toString, Collectors.counting()));
        duplicateElements.forEach((key, value) -> System.out.println(key + "=" + value));


    }
}
