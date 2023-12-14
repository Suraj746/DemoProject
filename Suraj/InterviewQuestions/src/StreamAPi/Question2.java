package StreamAPi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question2 {
    //Arrays multiplication using stream or java 8 features
    public static void main(String[] args) {
        Integer arr[]={10,20,30,40,50,60};
        System.out.println(arr.length);
        List<Integer> li= Arrays.asList(arr);
        Optional<Integer> i = li.stream().reduce((a, b) -> a * b);
        System.out.println("Sum"+i);

        Integer sum=i.get();
        System.out.println("Multiplication"+sum);
        li.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);





    }
}
