

public class LinearSearch {

    public static int searchNumber(int[] arr,int num){
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == num){
                return num;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {12,45,63,22,18,31,25};
        int number = 46;
        if(number == searchNumber(arr, number)){
            System.out.println("Number is available");
        }else{
            System.out.println("number is not found");
        }

    }
    
}
