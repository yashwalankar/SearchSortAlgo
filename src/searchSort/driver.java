package searchSort;

import java.util.Arrays;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int testArray[] = {1,6,2,-7,2,23,-99,6};
		
		System.out.println(Arrays.toString(testArray));
		
		sort.insertionSort(testArray);
		System.out.println(Arrays.toString(testArray));

	}

}
