package StringIQ;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter new String");
		// Scanner s = new Scanner(System.in); // method to take the input from console

		// to read the string
		// String str = s.nextLine();
		String x = "Mehak's Kapoor";

		char[] y = x.toCharArray();
		int size = y.length;
		int vCount = 0;
		int cCount = 0;
		int sCount = 0;
		int i = 0;

		while (i != size) {
			if (y[i] >= 'A' || y[i] >= 'a' && y[i] <= 'Z' || y[i] <= 'z') {
				if (y[i] == 'A' || y[i] == 'a' || y[i] == 'E' || y[i] == 'e' || y[i] == 'O' || y[i] == 'o'
						|| y[i] == 'U' || y[i] == 'u') {
					++vCount;
				} else {
					++cCount;
				}
			} else {
				++sCount;
			}
			i++;
		}
		System.out.println(y);
		System.out.println(vCount);
		System.out.println(cCount);
		System.out.println(sCount);

		// >>>>>>>>>>>>>>>>with Java 8 Streams>>>>>>>>>>>>>......

		// System.out.println("-------with Java 8 Streams --------");

		vowelCountStreams("Hello world");

	}

	// >>>>>>>>>>>>>>>>with Java 8 Streams>>>>>>>>>>>>>......

	public static void vowelCountStreams(String test) {

		System.out.println("-------with Java 8 Streams --------");

		IntPredicate vowel = new IntPredicate() {

			@Override
			public boolean test(int t) {

				return t == 'A' || t == 'a' || t == 'E' || t == 'e' || t == 'I' || t == 'i' || t == 'O' || t == 'o'
						|| t == 'U' || t == 'u';
			}

		};

		long count = test.chars().filter(vowel).count();
		System.out.println(count);
	}

	public static void vowelCountGoogleGuava(String test) {

		System.out.println("-------with Google Guava--------");

		/*
		 * String st = "heeeeelllloooooo"; int voCount =
		 * CharMatcher.anyOf("aeiouAEIOU").countIn(st); 
		 * System.out.println(voCount);
		 */
	}

}