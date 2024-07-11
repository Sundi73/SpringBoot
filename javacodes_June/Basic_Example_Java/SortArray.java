

public class SortArray {
	
	public static int[] sortElement(int[] arr) {
		
		int temp = 0;
		// {2,4,2,7,4,6,1,3}
		for(int i=0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}

}
