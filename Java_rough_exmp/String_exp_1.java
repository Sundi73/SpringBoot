public class String_exp_1 {

    public static void main(String[] args) {
        
        String s = "Ashutosh";
        String p = new String("Ashutosh");
        String t = "Ashutosh";

        if(s.equals(p))
        System.out.println("true");

        if(s == t){
            System.out.println("true");

        }else{
            System.out.println("false");
        }


    }
    
}
