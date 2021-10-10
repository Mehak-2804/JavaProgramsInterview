package JavaInterviewPractice2021;

public class ReverseWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "Hello! This is Mehak"; // output : Mehak is This Hello!
		int i = st.length() - 1;
		String result = "";

		while (i >= 0) {

			while (i >= 0 && st.charAt(i) == ' ')
				i--;

			int j = i;
			System.out.println(j);
			if(i<0)
				break;

			while (i >= 0 && st.charAt(i) != ' ')
				i--;

			if (result.isEmpty()) {
				result = result.concat(st.substring(i + 1, j + 1));
			} else {
				result = result.concat(" " + st.substring(i + 1, j + 1));
			}
			
		}
		System.out.println(result);
	}
}
