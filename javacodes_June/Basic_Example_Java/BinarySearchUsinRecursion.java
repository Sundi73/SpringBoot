


public class BinarySearchUsinRecursion {

    public static int searchBinaryNumberUsingRecursion(int[] array,int first,int last,int key){
        
        int mid = (first+last)/2;
            if(first <= last){
            if(array[mid] == key){
                return mid;
            }
            if(array[mid] < key){
                return searchBinaryNumberUsingRecursion(array, mid+1, last, key);

            }else{
                return searchBinaryNumberUsingRecursion(array, first, mid-1, key);
            }
        }
        return 0 ;
    }

    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60};
        int last = array.length-1;
        int key = 90;

        int result = searchBinaryNumberUsingRecursion(array, 0, last, key);

        if(array[result] == key){
            System.out.println("test ok");
        }else{
            System.out.println("Test Failed");
        }
    }

}
