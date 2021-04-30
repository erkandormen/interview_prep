package day_01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//TODO
/*
 *   Count the words in a String one by one
	  
	  For Example:
	  Input #
	  String is "Ali came to school and Ayse came to school"
	  
	  Output #
	  Ali=1, came=2, to=2, school=2, and=1, Ayse=1
 */
public class IQ_05_WordCounter {

	public static void main(String[] args) {
		 
		String str = "Ali came to school and Ayse came to school";
		String [] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		
		Map<String,Integer> numOfWords = new HashMap<>();

		for(String w: words) {
		if(numOfWords.containsKey(w)) {
			numOfWords.put(w, numOfWords.get(w)+1);
		}else {
			numOfWords.put(w, 1);
		}
//		System.out.println(numOfWords);
		}
		System.out.println(numOfWords);
	}

}
