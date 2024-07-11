public class Exception_1 {

    public static int divide(int a, int b){

        int c = a/b;
        
        if (c == 0 )
        throw new ArithmeticException();
        return c ;
        

    }
    
    public static void main(String[] args) {
        
       try{
        int result = divide(10, 0);
        System.out.println(result);
       }catch(Exception e){
        System.out.println("Error are captured!!");
       }
    }
}
