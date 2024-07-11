package Basics;

public class Test {
    public static void FindFirstAndSecondElement(int[] arr){
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int i = 0;i < arr.length;i++){
            if(arr[i] > firstHighest){
                secondHighest = firstHighest;
                firstHighest = arr[i];
            }
        }

        System.out.println(firstHighest+"-"+secondHighest);
    }

    public static void main(String[] args) {
        int[] arr = {12,19,13,20,33,12,29};
        FindFirstAndSecondElement(arr);
    }
}
