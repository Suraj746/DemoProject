package InterviewQ;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(list -> list.stream()) // Flattens the list of lists into a single stream of integers
                .map(number -> number * 2) // Doubling each element
                .collect(Collectors.toList());

        System.out.println(flattenedList); // Output: [2, 4, 6, 8, 10, 12, 14, 16]
        
        
       
    }
}
