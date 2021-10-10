package StringIQ;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// to check whther the string is Pangram or not
		
	//	String s = "I AM MEHAK KAPOOR AND LIVING IN DELHI";
		String s="The Quick Brown Fox Jumps over a lazy dog";
		s=s.replace(" ", "");
		s=s.toLowerCase();
		
		char []c = s.toCharArray();
		int size = c.length;
		int a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int i=0;
	while(i!=size)
	{
		
		int index=c[i]-97; // for uppercase, we will use 65 as its the ascii code for caps "A"
		a[index]=1;
		++i;		
	}
	
	i=0;
	while(i!=26)
	{
		if(a[i]==1)
		{
			++i;
		}
		else
		{
			System.out.println("Non Pangram");
			System.exit(0);
		}
		}
	System.out.println("Pangram");
	
	}
}
