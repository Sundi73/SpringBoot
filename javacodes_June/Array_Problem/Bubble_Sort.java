package Array_Problem;

import java.util.Scanner;

public class Bubble_Sort {

    public static int[] sortedArray(int[] arr){

            
        return arr;
    }


   public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

    //  System.out.println("Enter the length of array:");
    //  int len = scan.nextInt();
    //  int[] array = new int[len];
    //  System.out.println("Enter the array");

    //  for(int i=0;i<=array.length-1;i++){
    //     array[i] = scan.nextInt();
    //    // System.out.println("Value"+ array[i]);
    //  }

    //  System.out.println(array.length);

     int[] array2 = {12,11,3,2,5,4,9};
     int[] result = sortedArray(array2);

     for(int i: result){
        System.out.print(i+" ");
     }
   }

    
}
