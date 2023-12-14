package InterviewQ;

//Distinct and Counting:

//Given a list of words, find the count of distinct words using Streams.
import java.util.Arrays;
import java.util.List;

public class Counting {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "apple", "date", "banana", "apple");

        long distinctWordCount = words.stream()
                .distinct()
                .count();

        System.out.println("Count of distinct words: " + distinctWordCount);
    }
}

