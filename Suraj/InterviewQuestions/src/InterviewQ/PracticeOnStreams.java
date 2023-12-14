package InterviewQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeOnStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list= Arrays.asList(1,33,3,3,4,5,6);
		
//		GREATEST NUMBER IN THIS LIST
		int max= list.stream().max(Integer::compare).orElse(null);
		System.out.println("Maximum number"+max);
		
		List<Integer> distinctList=list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctList);
		
		String inputString = "programming";
		inputString.chars().mapToObj(ch -> (char) ch).forEach(System.out::println);
		Map<Character, Long> collect = inputString.chars() // Step 1: Create an IntStream of character codes
	    .mapToObj(ch -> (char) ch) // Step 2: Convert the character codes to Characters
	    .collect(Collectors.groupingBy(
	        Function.identity(), // Step 3: Group characters by their identity (themselves)
	        Collectors.counting() // Step 4: Count the occurrences of each character
	    ));
		System.out.println(collect.entrySet().stream().filter(entry -> entry.getValue()== 1).map(Map.Entry::getKey));

//		Non repeated Element in this string
		System.out.println("--Non repeated Elements --");
		collect.entrySet().stream().filter(entry -> entry.getValue()== 1).map(Map.Entry::getKey).forEach(System.out::println);
		
		System.out.println("Repeated Elements");
		inputString.chars() // Step 1: Create an IntStream of character codes
		    .mapToObj(ch -> (char) ch) // Step 2: Convert the character codes to Characters
		    .collect(Collectors.groupingBy(
		        Function.identity(), // Step 3: Group characters by their identity (themselves)
		        Collectors.counting() // Step 4: Count the occurrences of each character
		    ))
		    .entrySet().stream() // Step 5: Convert the entry set of the map to a Stream
		    .filter(entry -> entry.getValue() > 1) // Step 6: Filter entries with count > 1
		    .map(Map.Entry::getKey) // Step 7: Extract the characters
		    .forEach(System.out::println); // Step 8: Print the repeated characters

		
		
		List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7, 4,88,9,99,0);
		
		System.out.println("Sum of arrayList");
		Integer sum = numbers.stream().reduce((a,b) -> a+b).get();
		System.out.println(sum);
		
		System.out.println("Descending order of the arraylist");

        // Using Stream API to sort in descending order
        List<Integer> descendingOrder = numbers.stream()
            .sorted((a, b) -> b.compareTo(a)) // Custom comparator for descending order
            .collect(Collectors.toList());

        System.out.println("Numbers in descending order: " + descendingOrder);
        
        System.out.println("Finding duplicate elements from a list");
        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 2, 4, 5, 4, 6, 7, 7);
        
        Set<Integer> duplicatenums=new HashSet<Integer>();
        
        Set<Integer> duplicate=numbers4.stream().filter(n -> !duplicatenums.add(n)).collect(Collectors.toSet());
        
        System.out.println(duplicate);


	}

}
