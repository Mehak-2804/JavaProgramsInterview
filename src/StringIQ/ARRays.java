package StringIQ;


public class ARRays {
	
	public static void main(String[] args)
	{
		
		int a[]= {9,8,5,0,1};
		 int i;
		 int largest1; int n=5; int largest2;
		
		
		 largest1= a[0];
		 
		for(i=0;i<n;i++) 
		{
			if(a[i]>largest1)
			{
				largest1=a[i];
			}
		}
		
		largest2= a[0];
		 
			for(i=1;i<n;i++) 
			{
				if(a[i]>largest2 && a[i]<largest1)
				{
					largest2=a[i];
				}
			}
		
		System.out.println("first largest no."+ largest1);
		System.out.println("second largest no."+ largest2);
	}

}
