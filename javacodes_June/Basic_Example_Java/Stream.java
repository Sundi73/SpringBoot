import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Stream
 */
public class Stream {

    public static void main(String[] args) {
       List<Integer> list= Arrays.asList(1,2,3,4,5,2,5,6,3,7,8,66,5,776,5,8,89,85,335,8,9,7,53,2);
      Long list1 = list.stream()
                .filter(n -> n %2 == 0)
                .map(n->n*n)
                .distinct().limit(4)
                .sorted((a,b)-> a-b).count();
                  System.out.println(list1);

                    int[] arr = {1,2,3,2,3,4,3,1,4,6,6,6,8};
                Long l = Arrays.stream(arr).distinct().count();

               Set<Integer> s =  list.stream().collect(Collectors.toSet());
               s.forEach(n -> System.out.print(" "+n));

               System.out.println();

               list.stream().sorted().collect(Collectors.toList()).forEach(n -> System.out.print(n+" "));
   
    }
}