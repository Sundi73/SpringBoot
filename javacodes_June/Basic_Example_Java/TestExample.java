

public class TestExample {

    public static void main(String[] args) {
       final int x =100;
        Runnable r = new Runnable() {
            public void run(){
                System.out.println(x);
            }
        };
        r.run();
    }
    
}
