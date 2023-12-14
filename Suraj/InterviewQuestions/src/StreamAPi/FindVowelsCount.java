package StreamAPi;

import java.util.Map;
import java.util.stream.Collectors;

public class FindVowelsCount {
    public static void main(String[] args) {
        String str="aeiou dfJaa";
        long count = str.chars().filter((x) -> {
            return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u');
        }).count();
        System.out.println(count);

        //find the duplicate letters
        Map<String, Long> collect = str.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
        collect.forEach((key,value)->System.out.println("key"+key+"="+value));


       new FindVowelsCount().test1("Suraj");

    }

    public void test1(String s){
        System.out.println("My name is Suraj");
    }

    public void test1(StringBuffer sb){
        System.out.println("My name is Pradhan");
    }



}
