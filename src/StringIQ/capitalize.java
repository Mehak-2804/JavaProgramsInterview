package StringIQ;

public class capitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		convertFirstLetter("some_string_of_text");
				
	}

	
	
	public static void convertFirstLetter(String str) {
		
		
		int len = str.length();
		int i;
		String result="";
		
		for(i = 0; i<=len-1; i++) {
			
			char ch = str.charAt(i);
			
			if(ch == '_') {
				
				result = result + ch;
				
				i++;
				
				ch = str.charAt(i);
				result = result + (Character.toUpperCase(ch));
			}
			else {
				result = result + ch;
			}
			
		}

		result = result.replaceAll("_", "");
		
		System.out.print(result);
	}
}
