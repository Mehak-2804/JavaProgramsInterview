package StringIQ;

public class LowerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "mehak kapoor";
		// I want to convert first and last letter of every word to UpperCase
		// O/P should be "MehaK KapooR"

		char y[] = x.toCharArray();
		int size = y.length;

		y[0] = (char) (y[0] - 32);
		int i = 1;

		while (i != size) 
		{
			if (y[i] == ' ') 
			{
				y[i - 1] = (char) (y[i - 1] - 32);
				y[i + 1] = (char) (y[i + 1] - 32);
			}
			
				else if(i==size-1)
				{
				y[i] = (char) (y[i] - 32);
				}
			++i;
			}	
		System.out.println(x);
		System.out.println(y);
		}
	
	}

