package Code_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class max_value {
    
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(12,3,43,24,45,44,22);

      Optional<Integer> o = list.stream().max(Comparator.naturalOrder());
      System.out.println(o);

      Integer s =  list.stream().mapToInt(n -> n).sum();
      System.out.println(s);
    }
}
