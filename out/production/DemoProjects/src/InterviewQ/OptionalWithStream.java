package InterviewQ;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


//How can you use the Optional class in combination with the Stream API to handle cases where a 
//value might be missing in a Stream operation?
public class OptionalWithStream {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        Optional<String> firstElement = names.stream().findFirst();

        if (firstElement.isPresent()) {
            System.out.println("First element: " + firstElement.get());
        } else {
            System.out.println("Stream is empty.");
        }
        
        
        Optional<String> anyElement = names.stream().findAny();

        if (anyElement.isPresent()) {
            System.out.println("Any element: " + anyElement.get());
        } else {
            System.out.println("Stream is empty.");
        }
    }
}
