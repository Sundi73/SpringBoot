

import java.util.LinkedHashMap;
import java.util.Map;

public class longestSubstring {

    public static void main(String[] args) {
        longestLenthSubString("abbca");
        //reverseString("Ashutosh");
    }
    
    public static void longestLenthSubString(String s){
            String longestSubString = null;
            int lengthOfSubString = 0;

            Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
            char[] arr = s.toCharArray();

            for(int i=0; i<arr.length;i++){
                char ch = arr[i];

                if(!map.containsKey(ch)){
                    map.put(ch,i);
                }else{
                    i = map.get(ch);
                    map.clear();
                }

                if(map.size()>lengthOfSubString){
                    lengthOfSubString = map.size();
                    longestSubString = map.keySet().toString();
                }
            }

            System.out.println(longestSubString);
            System.out.println(lengthOfSubString);

            for (Map.Entry m : map.entrySet()) {
                System.out.println(m.getKey()+" "+m.getValue());
                
            }
    }

    public static void reverseString(String s){
        String r = "";
        char[] ch = s.toCharArray();

        for(int i = ch.length-1;i>=0;i--){
            r+=ch[i];
        }
        System.out.println(r);
    }


}
