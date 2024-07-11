

import java.util.*;

public class FrequencyCountUsingMap {

    public static void getCount(String name){

        Map<Character,Integer> charMap = new HashMap<Character,Integer>();

        char[] ch = name.toCharArray();

        for(char c : ch){
            if(charMap.containsKey(c)){
                charMap.put(c , charMap.get(c)+1);
            }else{
                charMap.put(c,1);
            }
        }
        System.out.println(name +" "+ charMap);
    }

    public static void main(String[] args) {
     getCount("java");   
    }
    
}
