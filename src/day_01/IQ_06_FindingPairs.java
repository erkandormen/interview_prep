package day_01;

/*
 *  *  From a given array find all pairs whose sum is a given number
			  {4, 6, 5, -10, 8, 5, 20} ==> 10
			  
			  For example;	
			  Output #
			  4 + 6 = 10, 5 + 5 = 10, -10 + 20 = 10 
 */
public class IQ_06_FindingPairs {

	public static void main(String[] args) {
		int givenNumber=10;
		findPairs(new int[] {4, 6, 5, -10, 8, 5, 20},givenNumber);
	}

	private static void findPairs(int[] arr, int num) {
	
		for (int i = 0; i < arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]+arr[j]==num) {
					System.out.println(arr[i]+" + "+arr[j]+" = "+num);
				}
			}
		}
		
	}
}
