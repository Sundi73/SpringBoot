package Code_Stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * reverse_string
 */
public class reverse_string {

    public static String reverseString(String string){

        return IntStream.range(0, string.length())
                .mapToObj(num -> string.charAt(string.length()-1-num))
                .map(Object :: toString)
                .collect(Collectors.joining());

    }

    public static void reverse_S(String as){
        String a = "";
        for(int i = as.length()-1;i>=0;i--){
            a += as.charAt(i);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        String s = "Ashutosh";
        System.out.println(reverseString(s));
        reverse_S(s);
    }
}