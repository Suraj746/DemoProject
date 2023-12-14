package StreamAPi;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoins {
    public static void main(String[] args) {
        String str="My name is Suraj";
        String arr[]= str.split(" ");
        StringJoiner joiner=new StringJoiner("-","[","]");
        for(String s:arr){
            joiner.add(s);
        }
        System.out.println(joiner.toString());
        List<String> list2= Arrays.asList("My","name","Suraj","Pradhan");
        String collect = list2.stream().collect(Collectors.joining("-"));
        System.out.println(collect);

        StringJoiner joiner2=new StringJoiner("-");
        for(String s:arr){
            joiner2.add(s);
        }
        System.out.println(joiner2.toString());

    }
}
