import java.util.HashMap;
import java.util.Map;

public class duplicateElement {

    public static void removeElement(int[] arr){
        Map<Integer,Boolean> map = new HashMap<>();

        for(int num : arr){
            if(map.get(num) == null){
                map.put(num,true);
            }
        }
       map.forEach((k,v) -> System.out.println(k));
    }

    public static void main(String[] args) {

        int[] arr = {1,4,3,4,2,2,2,5,6,5,4,7};
        removeElement(arr);
    }
    
}
