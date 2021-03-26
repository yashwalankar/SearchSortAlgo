package searchSort;

public class sort {
	public static void selectionSort(int array[]) {
		int len = array.length;
		for(int i=0;i<len-1;i++) {
			int minIdx = i;
			for(int j=i+1;j<len;j++) {
				if(array[j] < array[minIdx])
					minIdx=j;
			}
			
			swap(array,minIdx,i);
		}
		
	}
	
	private static void swap(int array[],int index1,int index2) {
		int temp = array[index1];
		array[index1]=array[index2];
		array[index2]=temp;
		
	}
	public static void insertionSort(int array[]) {
		int len = array.length;
		
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j>0;j--){
				if(array[j]<array[j-1]){
					//swap j and j-1
					swap(array,j,j-1);
				}
					
			}
		}
	}
	

}
