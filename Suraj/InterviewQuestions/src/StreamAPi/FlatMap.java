package StreamAPi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {

        List<List<Integer>> dynamic2d = new LinkedList<>();
        dynamic2d.add(Arrays.asList(1,2,3));
        dynamic2d.add(Arrays.asList(4,5));
        dynamic2d.add(Arrays.asList(6,7,8,9,10));

        // filter even numbers and sum of the list
        int evenSum = dynamic2d.stream()
                .flatMap(List::stream)
                .filter(n -> n % 2 == 0)
                .reduce((a,b) -> a + b).get();
        System.out.println("EvenSum"+evenSum);


        for (List<Integer> integers : dynamic2d) {
            System.out.print(integers);
        }

        List<Integer> list2=List.of(2,3,4,5,6,7,8,9,10,0,1);
        Integer i = list2.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("Minimum Number"+i);

        List<Integer> list3=List.of(2,3,4,5,6,7,8,9,10,0,1);
        Integer i1 = list3.stream().max(Integer::compare).orElse(null);
        System.out.println("Maximum Number"+i1);

        String arr[]={"Suraj","Pradhan","suraj"};
        List<String> list5=List.of(arr);
        list5.stream().sorted().forEach(System.out::println);






    }
}
