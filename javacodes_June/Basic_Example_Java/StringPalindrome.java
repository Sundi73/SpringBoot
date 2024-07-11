

public class StringPalindrome {
	
	public static boolean check = true;
	
	public static boolean checkPalindrome(String string) {
		int low = 0;
		int high = string.length()-1;
		while(low<=high) {
			if(string.charAt(low)!=string.charAt(high)) {
				check = false;
				break;
			}
			low++;
			high--;
		}
		
		return check;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String string = "ababa";
			if(checkPalindrome(string))
				System.out.println("The string is palindrome");
			else
				System.out.println("String is not palindrome");
	}

}
