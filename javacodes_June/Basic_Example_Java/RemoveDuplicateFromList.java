import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromList {


    public static ArrayList<Integer> removeDuplicateElementFromList(ArrayList<Integer> list){

       
        Set<Integer> set = new HashSet<>();

        set.addAll(list);

        list.clear();

        list.addAll(set);

        return list;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));

        System.out.println("Old ArrayList : "+ list);

        ArrayList<Integer> list2 = removeDuplicateElementFromList(list);

        list2.forEach(n -> System.out.println(n));
    }
    
}
