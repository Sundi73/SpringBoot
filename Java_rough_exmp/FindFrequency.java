import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequency {

public static void main(String[] args) {
    String s = "appleappale";

    List<String> asList = Arrays.asList(s.split(""));

    
      Map<String,Long> map = asList.stream().collect(Collectors.groupingBy(n -> n , Collectors.counting()));

      map.entrySet().stream().filter(n -> n.getValue()> 1).forEach((n -> System.out.println(n.getKey()+" "+n.getValue())));

    }

}
