package String;

import java.util.Arrays;

public class FindLongestStringfromStringArray {
public static void main(String[] args) {
    
    String[] letter = {"GFG", "Geeks", "for","GeeksQuiz", "GeeksforGeeks"};

    String string = Arrays.stream(letter).reduce((l1,l2) ->l1.length()>l2.length() ? l1 : l2 ).get();

    System.out.println(string);

}
    
}
