package JavaInterviewPractice2021;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "This is Mehak";  // output - kaheM si sihT

		//char[] ch = st.toCharArray();
		int size = st.length();
		String str = "";

		for (int i = size - 1; i >= 0; i--) {
			str = str + st.charAt(i);
		}
		System.out.println(str);
	}

	
	

}
