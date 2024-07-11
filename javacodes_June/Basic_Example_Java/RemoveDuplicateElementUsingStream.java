

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementUsingStream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,3,4,2,2,2,5,6,5,4,7);

       List<Integer> newList =  list.stream()
        .distinct()
        .collect(Collectors.toList());
        
        
        System.out.println(newList);
    }

    
    
}
