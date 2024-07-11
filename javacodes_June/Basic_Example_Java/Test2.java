import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test2 {
    
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Ashutosh","Abhishek","Raj");

        List<String> newList = list.stream().filter(n -> n.startsWith("A")).map(n ->n.concat(" Tiwari")).collect(Collectors.toList());


        

       newList.forEach(name -> System.out.println(name));

       list.sort((str1,str2) -> str1.compareToIgnoreCase(str2));

       System.out.println(list);
       
    //    BiFunction<Integer,Integer,Integer> sum = (n,m) -> n+m;
    //     System.out.println(sum.apply(5,20));
       
    //     Supplier<String> msg = () -> "Hello, World";
    //      System.out.println(msg.get());

    //     Predicate<Integer> num = x -> x%2!=0;
    //     System.out.println(num.test(10));







    //     System.out.println();
    }
}
