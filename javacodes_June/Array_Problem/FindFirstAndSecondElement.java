package Array_Problem;

public class FindFirstAndSecondElement {

    public static int[] newValue(int[] arr){

        for(int i = 0;i < arr.length-1;i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr ;

    }


    public static void main(String[] args) {
        int[] array = {1,7,3,6,2,9,4,5};

        int[] newArray = newValue(array);
        // System.out.println("First Higest element : "+ newArray[newArray.length-1]);
        // System.out.println("Second Higest element : "+ newArray[newArray.length-2]);

        FirstandSecondElement(array);
    }

    public static void FirstandSecondElement(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length ; i++){   // {1,7,3,6,2,9,4,5}
            if(arr[i] > first){
                second = first ;
                first = arr[i];
            }
        }

        System.out.println(first +"-"+ second);
    }
}
