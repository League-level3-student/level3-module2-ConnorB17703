package _00_Sorting_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;


public class _01_SwappingDigits {

	
	
	@Test
	public void test() {
		int[] x = {5, 6};
		int[] y = {6, 5};
		swapArrayOfTwo(x);
		assertArrayEquals(y, x);
		
		int[] z = {7, 3, 5, 9, 2};
		int[] q = {2, 3, 5, 7, 9};
		sortIntArray(z);
		assertArrayEquals(q, z);
		
		int[] m = {7, 3, 9, 5, 2};
		//assertEquals(5, findMiddle(m));
	}
	
	//1. Complete the method so that the first two elements of the array are swapped
	public static void swapArrayOfTwo(int[] arr) {
		int temp = arr[0];

		arr[0] = arr[1];
		arr[1] = temp;
		
		
	}
	
	
	
	//2. Complete the method so that it sorts the array using a bubble sort.
	//   Iterate through the array and when you find two elements that are out
	//   of order, swap them. Repeat this until the array is in order.
	public static void sortIntArray(int[] arr) {
		boolean bb = _00_SortedArrayChecker.intArraySorted(arr);
		while(bb == false){
			for(int i = 0 ; i < arr.length-1;i++){
				if(arr[i]>arr[i+1]){
					int t = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = t;
				}
			}
			bb = _00_SortedArrayChecker.intArraySorted(arr);
		}
		
	}
	
	//3. Complete the method so that it finds the middle number in the array.
	//   *Hint* it helps to sort it first.
	//   *Double Hint* Use the method you already wrote in step 2 to sort it
	public static int findMiddle(int[] arr) {
		return 0;
	}
}
