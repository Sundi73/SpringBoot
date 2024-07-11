public class palindrome_101 {


    public static boolean check = true;

    public static boolean checkPalindrome(String s){


        int low = 0;
        int high = s.length()-1;

        while(low<=high){
            if(s.charAt(low)!= s.charAt(high)){
                check = false;
                break;
            }
            low++;
            high--;
        }

        return check;
    }

    public static void main(String[] args) {

        String s = "ababaa";

        if(checkPalindrome(s))
            System.out.println("palindrome");
        else 
            System.out.println("not palindrome");
        
    }
    
}
