package JavaInterviewPractice2021;

public class OccurenceForSpecificChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getCharCount("Hello testing", 't');
		getCharOccurrence("unicorn", 'n');
		getCharOccurrenceUsingStreams("I fall for myself" , "f");
	}

//////////////////looking for occurence of specific character in a string

	public static void getCharCount(String str, char val) {

		int count = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == val)
				count++;

		}
		System.out.println(val + "::::" + count);

	}
////////////////////////////////////// another way ////////////////////////////////////////

	public static void getCharOccurrence(String st, char value) {

		int count = 0;

		for (char vall : st.toCharArray()) {

			if (vall == value)
				count++;

		}
		System.out.println(value + ":::" + count);
	}

/////////////////////////////////////// another way : streams /////////////////////////////////////

	public static void getCharOccurrenceUsingStreams(String str, String val) { // need to pass string as a character

		long count = str.chars().mapToObj(e -> String.valueOf((char) e)).filter(e -> e.equals(val)).count();
		System.out.println(val + "::" + count);

	}

// another way : stringUtils

}
