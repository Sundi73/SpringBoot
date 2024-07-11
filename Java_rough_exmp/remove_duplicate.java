import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class remove_duplicate {


    public static void main(String[] args) {
    
       Integer a[] = {1,4,3,4,2,2,2,5,6,5,4,7};
       List<Integer> lst = Arrays.asList(a);

       List<Integer> l = lst.stream().distinct().collect(Collectors.toList());
       //l.forEach(n -> System.out.println(n));

       Integer a1[] = {1,4,3,4,2,2,2,5,6,5,4,7};
       Set<Integer> s = new HashSet<>(Arrays.asList(a1));

       Integer[] awithoutd = s.toArray(new Integer[0]);

       for (Integer integer : awithoutd) {

        System.out.println(integer);
        
       }

    }
    
}
