package JavaInterviewPractice2021;

public class OccurenceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="aabbccdd";
		s=s.toLowerCase();
		char[] c=s.toCharArray();
		int sz=s.length();
		int i=0;int j=0; int counter=0;
		for(i=0;i<sz;i++)
		{
			counter=0;
			for(j=0;j<sz;j++)
			{
				if(j<i&&c[i]==c[j])
				{
					break;
				}
				if(c[j]==c[i])
				{
					counter++;
				}
				if(j==sz-1)
				{
					System.out.println(c[i] +""+ counter);
				}
				
			}
		}
		
	}

}
