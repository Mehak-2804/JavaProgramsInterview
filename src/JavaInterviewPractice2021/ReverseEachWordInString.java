package JavaInterviewPractice2021;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Learn Selenium Fast"; // output : nraeL muineleS tsaF 
		
		// we will split the entire string in separate string
		
		String[] words = str.split(" ");

		
		// we will reverse each word in a string
		
		String reverseString = "";
		
		for(String wr : words)
		{
			String reverseWords = "";
			for(int i=wr.length()-1; i>=0 ; i--)
			{
				reverseWords = reverseWords+wr.charAt(i);
			}
			
			// we will also add reverse words in a single string
				reverseString = reverseString+reverseWords+" ";
		}
		
		System.out.println(reverseString);		
		
	}

}
