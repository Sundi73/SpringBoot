package Code_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_pipeline {

  public static void print(String s){
    System.out.println(s+" ");
  }
    public static void main(String[] args) {
      List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape", "kiwi");

     Map<Integer,List<String>> newList = list.stream().collect(Collectors.groupingBy(String :: length));

     newList.forEach((length,str)-> System.out.println("Length "+length+" - "+str));

    




      String s = "OHello World";
      String s1 = s.replaceAll("(?i)O", "");
      System.out.println(s1);

    }
}
