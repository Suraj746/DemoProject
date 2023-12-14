/**
 * 
 */
package InterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author user
 *
 */
public class StreamApis {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//stream()
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		Stream<String> stream = names.stream();
		System.out.println("Stream"+stream);
		
		//filter(Predicate<T> predicate)
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer>	evenNumbers = numbers.stream().filter(n -> n % 2 == 0);
		System.out.println(evenNumbers);
		
		//map()
		List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie");
		Stream<Integer> nameLengths = names1.stream().map(String::length);
		List<Integer> lengths=names1.stream().map(String::length).collect(Collectors.toList());
		System.out.println("NameLength"+ lengths);
		
		//forEach()
		List<String> names2=Arrays.asList("Suraj","Pradhan","Mark","Pankaj");
		names2.stream().forEach(System.out::println);
		
		//collect(Collection<T,A,R> collector)
		List<String> names3=Arrays.asList("Suraj","Pradhan","Mark","Pankaj");
		List<String> filteredNames=names3.stream().filter(n -> n.startsWith("P")).collect(Collectors.toList());
		System.out.println("FilteredNames"+filteredNames);
		
		//reduce(identity,BinaryOperator<T> accumulate)
		List<Integer> num=Arrays.asList(1,2,3,4,5,6);
		int sum=num.stream().reduce(0,(a,b) -> a+b);
		System.out.println("Sum of the numbers"+sum);
		
		//sorted()
		List<String> names4=Arrays.asList("Suraj","Pradhan","Mark","Pankaj");
		List<String> sortedNames=names4.stream().sorted().collect(Collectors.toList());
		System.out.println("SortedNames"+sortedNames);
		
		//distinct()
		List<Integer> distInt=Arrays.asList(1,2,3,2,4,4,1,3,5,6,7,7,8);
		List<Integer> distElements=distInt.stream().distinct().collect(Collectors.toList());
		System.out.println("Dstinct ELements"+distElements);
		
		//limit()
		List<Integer> dist=Arrays.asList(1,2,3,2,4,4,1,3,5,6,7,7,8);
		List<Integer> limitedList=dist.stream().limit(3).collect(Collectors.toList());
		System.out.println("LimitedList"+limitedList);
		
		//skip()
		List<Integer> dist2=Arrays.asList(1,2,3,2,4,4,1,3,5,6,7,7,8);
		List<Integer> skippedList=dist2.stream().skip(3).collect(Collectors.toList());
		System.out.println("SkippedList"+skippedList);
		
		//anyMatch()
		List<Integer> matches=Arrays.asList(2,4,6,8,10);
		boolean matches2=matches.stream().anyMatch(n -> n%2==0);
		System.out.println("Matches"+matches2);
		
		//noneMatch()
		List<Integer> matches3=Arrays.asList(2,4,6,8,10);
		boolean matches5=matches3.stream().noneMatch(n -> n%5==0);
		System.out.println("NoneMatches"+matches5);
	

	

	}

}
