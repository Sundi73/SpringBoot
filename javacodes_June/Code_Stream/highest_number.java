package Code_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class highest_number {

    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(10,20,30,40,50);
       Optional<Integer> r =  list.stream().max(Comparator.naturalOrder());

       r.ifPresent(max -> System.out.println(max));
    }
    
}
