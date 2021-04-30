package day_01;

import java.util.Arrays;

public class IQ_03_BubbleSort {

	public static void main(String[] args) {
		/* ***** BubbleSort sorting algorithm
		 * Bubble Sort is the simplest sorting algorithm that works by 
		 * repeatedly swapping 
		 * the adjacent elements if they are in wrong order.

	Example:

		 * Array -> {23,4,567,8,9,0}
		 * 		step-1 ->	{4,23,567,8,9,0}
		 * 		step-2 -> 	{4,23,567,8,9,0}
		 * 		step-3 -> 	{4,23,8,567,9,0}
		 * 		step-4 -> 	{4,23,8,9,567,0} 
		 * 		step-5 -> 	{4,23,8,9,0,567}
		 * 
		First Loop:
( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
( 1 5 4 2 8 ) –> ( 1 4 5 2 8 ), Swap since 5 > 4
( 1 4 5 2 8 ) –> ( 1 4 2 5 8 ), Swap since 5 > 2
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), 
								algorithm does not swap them.

Second Loop:
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
Now, the array is already sorted, but our algorithm does not know if it is completed. 
The algorithm needs one whole pass without any swap to know it is sorted.

Third Loop:
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
		 * 
		 * */
		
		int [] array= {23,4,567,8,9,0};
		System.out.println("Before Bubble Sort -> "+Arrays.toString(array));
		
		bubbleSort(array);
		
		System.out.println("After Bubble Sort -> "+Arrays.toString(array));

	}

	static void bubbleSort(int [] arr ) {
		int n = arr.length;
		int temp=0;
		
		for(int i=0;i<n;i++) {
			for(int j=1; j<n-i;j++) {
				//swap numbers
				if(arr[j-1]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	
	
}
