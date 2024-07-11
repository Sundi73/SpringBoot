
public class PrimeNumber {
 
    public static boolean checkPrimeNumber(int num){

        for(int i = 2; i < num; i++){
            if(num % i == 0){
               return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        if(!checkPrimeNumber(9)){
            System.out.println("test ok");
        }else{
            System.out.println("test failed");
        }
    }

}
