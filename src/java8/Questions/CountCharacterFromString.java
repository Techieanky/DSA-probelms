package java8.Questions;
import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors ;

public class CountCharacterFromString {



    public void CountCharFromString(){

        String input = "ilovejavatechie";
        // Using Java8 Stream API... we can also do it by adding into a map
        Map<String, Long> map = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

                 System.out.println("Using Java8 Stream API :"+map);
                 // using Hashmap
        String[] strArray = input.split("");

        HashMap<String, Integer> counts = new HashMap<>();
        for(String str : strArray){

            if(counts.containsKey(str)){
                counts.put(str,counts.get(str)+1);
            }else {
                counts.put(str,1);
            }
        }
        System.out.println("using Hashmap :"+counts);
    }
}
