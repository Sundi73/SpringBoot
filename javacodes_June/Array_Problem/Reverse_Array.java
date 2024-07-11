package Array_Problem;

public class Reverse_Array {

    public static int[] reverseArray(int[] arr){
        int[] reverseOne = new int[arr.length];
        int count = 0;
        for(int i = arr.length-1;i>=0;i--){ //{6,5,4,3,2,1}
            reverseOne[count] = arr[i];
            count++;
        }

        return reverseOne;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] newArray = reverseArray(a);
        for(int i : newArray){
            System.out.println(i);
        }
    }
}
