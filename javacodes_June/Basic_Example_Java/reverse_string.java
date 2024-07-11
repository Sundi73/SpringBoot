public class reverse_string {

    public static void main(String[] args) {
        
        String s = "Ashutosh";
        String n = "";

        for(int i =s.length()-1;i >= 0 ;i--){
            n = n + s.charAt(i);
        }

        System.out.println(n);


    }
    
}
