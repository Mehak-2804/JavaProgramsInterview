package JavaInterviewPractice2021;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printDuplicateChar("aabbccdd");
//output  a:2
//		  s:2
//		  h:2
//		  i:2
//		  k:2
//		  o:2
//		getCharCount("Hello testing", 't');
//		getCharOccurrence("unicorn", 'n');
//		getCharOccurrenceUsingStreams("I fall for myself" , "f");
	}

	public static void printDuplicateChar(String str) {

		if (str == null) {
			System.out.println("Null String");
			return;
		}

		if (str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		if (str.length() == 1) {
			System.out.println("Single Char in String");
			return;
		}

		// covert string to charArray
		str = str.replaceAll(" ", "");
		str = str.toLowerCase();
		char[] ch = str.toCharArray();

		// we will create Map where we will store data in Character and Integer (K,V)

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character words : ch) {
			if (map.containsKey(words)) {
				map.put(words, map.get(words) + 1); // if map contains the character , then add char and count 1
			} else {
				map.put(words, 1); // if map doesn't contain the character, then add chara and 1
			}
		}

		// now , print map

		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();

		for (Map.Entry<Character, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {

				System.out.println(entry.getKey() + ":" + entry.getValue());

			}
		}

	}

	// looking for occurence of specific character in a string

	public static void getCharCount(String str, char val) {

		int count = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == val)
				count++;
			
		}
		System.out.println(val + "::::" + count);

	}
	// another way

	public static void getCharOccurrence(String st, char value) {

		int count = 0;

		for (char vall : st.toCharArray()) {

			if (vall == value)
				count++;

		}
		System.out.println(value + ":::" + count);
	}

	
	// another way : streams
	
	
	public static void getCharOccurrenceUsingStreams(String str, String val) { // need to pass string as a character
		
		long count = str.chars().mapToObj(e -> String.valueOf((char)e))
				.filter(e -> e.equals(val)).count();
		System.out.println(val + "::" + count);
		
	}
	
	
	// another way : stringUtils
	
	
}
