package Oops;


class bike{
    public void run(){
        System.out.println("Bike run's at 60 kmph");
    }
}

public class Method_Overring extends bike 
{
    public void run(){
        System.out.println("Bike speed is 40 kmph now.");
    }

    public static void main(String[] args) {
        Method_Overring mo = new Method_Overring();
      //  mo.run();
        bike b = new bike();
      //  b.run();

        bike b1 = new Method_Overring();
       // b1.run();


        System.out.println( mo instanceof bike);
        System.out.println(b1 instanceof Method_Overring);

    }
   
}
