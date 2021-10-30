package JavaInterviewPractice2021;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOfCapitalizeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " shortNewLongTable";

		// if small word is there in begining and if there's a space in the begining , then we just need to trim

		int c = 0;

		if (Character.isLowerCase(str.trim().charAt(c))) {
			c++;
		}

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				c++;
			}
		}
		System.out.println(c);
		
		
		// 1. >>>>>>>> Capital Chars

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}
		}
		System.out.println("count of capitalize chars in string is: " + count);

		// 2. >>>>>>>> ASCII

		int count1 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				count1++;
			}
		}
		System.out.println("count of capitalize chars in string is: " + count1);

		// 3. >>>>>>>> Uppercase

		int count2 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count2++;
			}
		}
		System.out.println("count of capitalize chars in string is: " + count2);

		// 4. >>>>>>>> Streams

		long count3 = str.chars().filter(e -> e >= 65 && e <= 90).count();
		System.out.println("count of capitalize chars in string is: " + count3);

		// 5. >>>>>>>> Streams

		long count4 = str.chars().filter(e -> Character.isUpperCase(e)).count();
		System.out.println("count of capitalize chars in string is: " + count4);

		// 6. >>>>>>>>> Reg exp

		String reg = "[A-Z]+";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(str);
		int count5 = 0;
		while (matcher.find()) {
			count5 += matcher.group(0).length();
		}
		System.out.println("count of capitalize chars in string is: " + count5);
	}
}
