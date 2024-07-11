import java.util.*;

public class CommandLine {

    // public static int factorial(int a){
    //   // while(a > 0){
    //     if(a == 1){
    //         return 1;
    //     }else{
    //         return(a * factorial(a-1));
    //     }

    //    //}
    // }

        


    public static void main(String[] args) {
        
        List<Integer> list  = Arrays.asList(2,3,4,5,6,7,8);

       list.stream().filter(n -> n%2==0).forEach(n -> System.out.println(n));

        
    }

}
