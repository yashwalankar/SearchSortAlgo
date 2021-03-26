package searchSort;

import static org.junit.Assert.assertEquals;


import java.util.Arrays;
import java.util.Random;

import org.junit.*;



public class tests {
	protected int arrayStart,arrayEnd,arraySize;
	protected int[] array;
	
		
	public void setup(boolean shuffle) {
		arrayStart = 0;
		arrayEnd=220;
		arraySize=arrayEnd-arrayStart+1;
		array = new int[arraySize];
		

		array[0]=arrayStart;
		
		//initialize array with all integers in the range [arrayStart,arrayEnd]
		int i =1;
		while(i<arraySize) {
			array[i]=array[i-1]+1;
			i++;
			
		}
		
		//System.out.println(Arrays.toString(array));
		
		//shuffle the array
		
		if(shuffle) {
		Random random = new Random();
		random.nextInt();
        
		for(int j=0;j<arraySize;j++) {
			
			int k = j + random.nextInt(arraySize - j);
			
			int temp = array[j];
			array[j] =array[k];
			array[k]=temp;
		
		}

		
		
		
		//System.out.println(Arrays.toString(array));
		
		}
		
	}
	
	
	@Test
	public void testBinarySearch() {
		setup(false);
		//BINARY 
		int randomValue= arrayStart + (int)(Math.random() * ((arrayEnd - arrayStart) + 1));
		assertEquals(Search.binarySearch(array, randomValue), Arrays.asList(array).indexOf(randomValue));
	}
	
	@Test
	public void testInsertionSort() {
		setup(true);
		
		int tempArray[] = array;
		
		sort.insertionSort(tempArray);
		Arrays.sort(array);
		assertEquals(tempArray,array);
		
	}
	
	@Test
	public void testSelection() {
		setup(true);
		
		int tempArray[] = array;
		
		sort.selectionSort(tempArray);
		Arrays.sort(array);
		assertEquals(tempArray,array);
		
	}

}
