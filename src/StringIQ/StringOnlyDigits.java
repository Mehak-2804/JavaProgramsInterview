package StringIQ;

public class StringOnlyDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// the way to check whether string contains only integers
		// count integers in a string
		String x = "mehak2804";
		int size = x.length();
		int i = 0;
		int intCount=0;
		int charCount = 0;
			
		while (i !=size)
		{
			if(x.charAt(i)>='0' && x.charAt(i)<='9')
			{
				System.out.print(x.charAt(i));
			intCount++;
			}
			else
			{
				charCount++;
			}
			++i;
		}
		
		System.out.println("\n"+x);
		System.out.println(intCount);
		System.out.println(charCount);
	}

}
