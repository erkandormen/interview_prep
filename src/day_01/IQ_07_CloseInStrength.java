package day_01;

/*
 * 	 	We are organizing a horse race with horses having distinct strengths. 
		 	The strength of the horses are represented by an array of integers. 
		 	In order to make the race competitive, your program should find out 
		 	the pair of horses with similar strengths:
		 	
	         For example: {3, 67, 9, 46, 55, 48}
	         Output#
	         46, 48
 */
public class IQ_07_CloseInStrength {

	public static void main(String[] args) {
		
		int [] arr = {3, 67, 9, 46, 55, 48};
		
		int diff = Integer.MAX_VALUE;
		int firstHorseInd =0;
		int secondHorseInd =0;
		
		for(int i=0; i<arr.length;i++) {
			for (int j = 1; j < arr.length; j++) {
				if(Math.abs(arr[i]-arr[j])<diff && Math.abs(arr[i] - arr[j])!=0) {
					diff=Math.abs(arr[i]-arr[j]);
					firstHorseInd=i;
					secondHorseInd=j;
				}
			}
		}
		System.out.println(arr[firstHorseInd]+ ", "+arr[secondHorseInd]);
	}
}
