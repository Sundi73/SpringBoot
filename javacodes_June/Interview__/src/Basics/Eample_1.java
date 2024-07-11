package Basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//@FunctionalInterface
//interface Addition1{
//public int add1(int a,int b); 
//}

public class Eample_1 {
	
	public static void print(String s) {
		System.out.print(s+" ");
	}
	
	public static void main(String[] args) {
		
		Eample_1 e = new Eample_1();
		List<String> list = Arrays.asList("A", "B","C");
		List<Employee> collect = list.stream().map(n -> new Employee(n)).collect(Collectors.toList());
		//list.stream().forEach(e::print);

		list.forEach(Eample_1 :: print);
	
	   // collect.forEach(System.out::println);

		

}
}
