abstract class Calculate{
    abstract void Multiply(int x,int y);
}


public class Example_2{

   public static void main(String[] args) {
    
    new Calculate() {
        void Multiply(int x ,int y){
            System.out.println(x * y);
        }
    }.Multiply(10,20);


   }
    
}
