import java.util.HashMap;
import java.util.Map;

public class two_sum_problem {

    public static int[] findTwoIndex(int[] arr,int x){


        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i< arr.length ;i++){
            int complement = x - arr[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }

            map.put(arr[i], i);
        }

        throw new IllegalArgumentException("No sum is available");
    }
    public static void main(String[] args) {

        int[] array = {2,7,11,13};

        int[] result = findTwoIndex(array, 9);

        System.out.println(array[result[0]] + " ,"+ array[result[1]]);
        
    }
}
