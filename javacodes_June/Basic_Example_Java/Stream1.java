import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

    public static void main(String[] args) {
        
         List<Integer> list1 = Arrays.asList(2,3,4,5,6,7,8,9);

        List<Integer> newList1 =  list1.stream().filter(n -> n%2==0).map(x -> x*2).collect(Collectors.toList()); 

        // newList1.forEach( n -> System.out.println(n));


        List<String> names = Arrays.asList("Ashutosh","Parwati","Dinesh","Animesh");

       names.stream().filter(x -> x.startsWith("A")).map(n -> n.concat(" T")).forEach(n -> System.out.println(n));

        


    }

}
