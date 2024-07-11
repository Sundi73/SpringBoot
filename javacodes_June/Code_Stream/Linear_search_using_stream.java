package Code_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Linear_search_using_stream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50);
        Integer target = 40;

        Optional<Integer> searchedElement = list.stream().filter(num -> num == target).findAny();
       if (searchedElement.isPresent()) {
        System.out.println("The element "+searchedElement.get()+" Is present");
       
       }
    }
}
