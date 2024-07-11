

public class BinarySearch {


    public static int SearchBinaryNumber(int[] arr,int first,int last, int key){
        int mid = (first/last)/2;  // key = 10
        while(first<=last){
            if(arr[mid]<key){       // 10,20,30,40,50
                first = mid + 1;
            }else if(arr[mid] == key){
                return mid;
            }else{
                last = mid - 1;
               
            }
            mid = (first+last)/2;
        }
        return 0 ;
    }

    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70};
        int key = 30;
        
        if(key == array[SearchBinaryNumber(array, 0, array.length-1, key)]){
            System.out.println("Test OK");
        }else{
            System.out.println("Test failed");
        }





    }

    
}
