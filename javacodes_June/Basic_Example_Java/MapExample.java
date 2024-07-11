
import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("Ashutosh",101);
		map.put("Shivam", 102);
		map.put("Ram",103);
		map.put("Shhyam", 104);
		
//		System.out.println(map);
		
//		for(Map.Entry map1: map.entrySet()) {
//			System.out.println(map1.getKey()+":"+map1.getValue());
//		}

		System.out.println(map);
		
		
		map.forEach((key,value)->System.out.println((key+" :: "+value)));

	}

}
