package Array_Problem;

public class Concate_Array {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,0};

        int n = arr1.length + arr2.length;
        
        int [] newArray = new int[n];

        for(int i = 0;i<arr1.length ;i++){
            newArray[i] = arr1[i];
        }

        for(int i = 0 ;i <arr2.length ; i++){
            newArray[arr1.length + i] = arr2[i];
        }

        for(int i : newArray){
            System.out.print(i+" ");
        }

        
     }
}
