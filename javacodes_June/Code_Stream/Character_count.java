package Code_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Character_count {
    public static void main(String[] args) {
        String str = "Java,Java";
       
       List<String> cr = Arrays.asList(str.split(","));

      Map<String,Long> new1 = cr.stream().collect(Collectors.groupingBy(n -> n,Collectors.counting()));

      new1.entrySet().stream().forEach(n -> System.out.println(n.getKey()+" "+n.getValue()));

      cr.stream().map(n -> n.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
