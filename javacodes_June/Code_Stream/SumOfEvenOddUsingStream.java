
package Code_Stream;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class SumOfEvenOddUsingStream {
	
	public static void main(String[] args) {
		// List of element 
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		int sum = list.stream().filter(n -> n %2 == 0).mapToInt(Integer :: intValue).sum();
		System.out.println(sum);
		
		OptionalDouble newSumList = list.stream().filter(num -> num % 2 == 0).mapToInt(n -> n).average();

		System.out.println(newSumList);

		//Array of element
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int sum2 = Arrays.stream(arr).filter(n -> n %2 == 0).sum();
		System.out.println(sum2);
		
	int sumOfOddNumber = list.stream()
			.filter(n -> n%2 != 0)
				.mapToInt(Integer :: intValue)
					.sum();
	
	
	//System.out.println(sumOfOddNumber);
	
	int[] array = Arrays.stream(arr).map(n -> n*2).toArray();
		
//		Arrays.stream(array).forEach(System.out::println);
	//System.out.println(Arrays.toString(array));
	
//	int[] a = Arrays.stream(arr).sorted((a,b)->b-a).mapToInt().(type[]) collection.toArray(new type[collection.size()])	}

	List<Integer> collect = list.stream().sorted((a,b)->b-a).collect(Collectors.toList());
	
	System.out.println(collect);
	
	
	
	
}

}
