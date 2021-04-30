package day02;

import java.util.HashMap;

/*
 *  * Given an array of integers a, your task is to count 
 * the number of pairs i and j (where 0 ≤ i < j < a.length), 
 * such that a[i] and a[j] are digit anagrams.
Two integers are considered to be digit anagrams if they contain the same digits. 
In other words, one can be obtained from the other by rearranging the digits 
(or trivially, if the numbers are equal). 

For example, 54275 and 45572 are digit anagrams, but 321 and 782 are not 
(since they don't contain the same digits). 
220 and 22 are also not considered as digit anagrams, since they don't even have 
the same number of digits.

Example
For a = [25, 35, 872, 228, 53, 278, 872], the output should be digitAnagrams(a) = 4.

There are 4 pairs of digit anagrams:
a[1] = 35 and a[4] = 53 (i = 1 and j = 4),
a[2] = 872 and a[5] = 278 (i = 2 and j = 5),
a[2] = 872 and a[6] = 872 (i = 2 and j = 6),
a[5] = 278 and a[6] = 872 (i = 5 and j = 6)
 */

public class IQ_04_DigitAnagram {
	
	public static void main(String[] args) {
		int a[] = {25, 35, 872, 228, 53, 278, 872};
		System.out.println("Digit anagrams: "+digitAnagrams(a));
	}

	private static int digitAnagrams(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(areAnagrams(arr[i],arr[j])) {
					count++;
					System.out.println("a["+i+"] = "+arr[i]+" and "+"a["+j+"] = "
			            	+arr[j]+" (i = "+i+" and j = "+j+"),");
				}
				
			}
		}
		
		
		return count;
		
	}

	private static boolean areAnagrams(int a, int b) {
		if(String.valueOf(a).length() != String.valueOf(b).length()) {
			return false;
		}
		HashMap<Integer,Integer> map = new HashMap<>();
		
		while(a>0) {
			int n = a%10;//45611
			if(map.containsKey(n)) {
				map.put(n, ((int) map.get(n))+1);
			}else {
				map.put(n,1);
			}
			a/=10;
		}
		
		while(b>0) {
			int n = b%10;
			if(map.containsKey(n) && map.get(n)>0) {
				map.put(n, ((int) map.get(n)-1));
			}else {
				return false;
			}
			b/=10;
		}
		
		
		return true;
		
		
	}

}
