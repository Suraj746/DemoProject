package StreamAPi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseStream {
    //Can we resuse the same stream -- no we have to use the Supplier instead
    public static void main(String[] args) {
        String inputarray[]={"Amit","suraj","cat","Amit","raj","cat"};
        List<String> list= Arrays.asList(inputarray);
        list.stream().forEach(System.out::println);
        long count = list.stream().filter(x -> "Amit".equalsIgnoreCase(x)).count();
        System.out.println(count);
//        Stream<String> str=list.stream();
//        str.forEach(System.out::println);
//        long count1 = str.filter(x -> "Amit".equalsIgnoreCase(x)).count();
//        System.out.println(count1);

        //Supplier interface was introduced in java 8 to reuse a stream

        Supplier<Stream<String>> inputStream=()-> Stream.of(inputarray);
        inputStream.get().forEach(System.out::println);
        long count1 = inputStream.get().filter(x -> "Amit".equalsIgnoreCase(x)).count();
        System.out.println(count1);


    }
}
