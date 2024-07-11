

public class Palindrome {
	
	public static boolean checkPalindrome(String str) {
		
		char c[] = str.toCharArray();
		
		int first = 0;
		int last = str.length()-1;
		
		while(first<last) {
			if(c[first] != c[last]) {
				return false;
			}
			last--;
			first++;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		if(checkPalindrome("121231")) {
			System.out.println("Is Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
