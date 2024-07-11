import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example_3 {
    
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("A","A","B","A","B","C","D","E");

        

        Map<String,Long> count = list.stream().collect(Collectors.groupingBy(n -> n ,Collectors.counting()));
        

        count.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach((n -> System.out.println(n.getKey()+"-"+n.getValue())));
        count.entrySet().forEach(n -> System.out.println(n));
        
        count.entrySet().stream().filter(n -> n.getValue() > 1).forEach(n-> System.out.println(n.getKey()+"-"+n.getValue()));
        
    }

}
