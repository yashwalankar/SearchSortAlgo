package searchSort;

public class Search {
	public static int binarySearch(int[] array , int target) {
		
		
		
		return binarySearch_helper(array,0,array.length-1,target);
	}
	
	private static int binarySearch_helper(int[] array, int left, int right, int target) {
		if (left>right)
			return -1;
		int mid = (left+right )/2;
		if(array[mid] == target) {
			return mid;
		}
		else if(target>array[mid]) {
			binarySearch_helper(array,mid+1,right,target);
		}
		else {

			binarySearch_helper(array,left,mid-1,target);
		}
		
		return -1;
	}

}
