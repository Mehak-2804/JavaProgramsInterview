package StringIQ;

import java.util.Arrays;

public class Anagrams {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Anagram is to check whether both string our equal or not , order of chars doesn't matter
		String str1 = "JAVA Ok";
		String str2 = "AVAJ ko";
		
		String st1= str1.toUpperCase();
		String st2= str2.toUpperCase();
		st1 = st1.replace(" ", "");
		st2 = st2.replace(" ", "");
		char[] ch1 = st1.toCharArray();
		char[] ch2 = st2.toCharArray();

	
		// sort two char arrays
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		boolean result = false;
		// compare two char arrays
		 result  = Arrays.equals(ch1, ch2);
		if(result==true)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}

}