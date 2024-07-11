


public class Example {

   public static void main(String[] args){
   
    int[] arr = {4,3,6,8,9,2,5,7,19,3,4,6};

    int high = 0;
    for (int i : arr) {
        if(i>high){
            high = i;
        }
    }
    System.out.println("the highest number is "+ high);

    }

    
}
