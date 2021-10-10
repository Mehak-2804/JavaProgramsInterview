package StringIQ;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Sentence = "I AM MEHAK KAPOOR";
		System.out.println("Original Sentence" + Sentence);

		// here, we will replace all white space chars with "" empty string literal
		String Sentence1 = Sentence.replaceAll("\\s", "");
		System.out.println("After removing white space chars, the sentence is " + Sentence1);

	}

}
