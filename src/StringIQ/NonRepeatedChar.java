package StringIQ;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class NonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "MehakKapoor";
		s=s.toLowerCase();
		char[] c = s.toCharArray();
		int size = c.length;
		
		Map<Character,Integer> map = new LinkedHashMap();
		int i =0;
		while(i!=size)
		{
			if(map.containsKey(c[i])==false)
			{
				map.put(c[i], 1);
			}
			else
			{
				int oldval = map.get(c[i]);
				int newval = oldval+1;
				map.put(c[i], newval);
			}
			++i;
		}
		
		char maxKey= ' ';
		int maxVal=0;
		
		
		Set<Map.Entry<Character,Integer>> lmap = map.entrySet();
		for(Map.Entry<Character,Integer> data : lmap)
		{
		    if(data.getValue()>maxVal)
		    {
		    	maxVal=data.getValue();
		    	maxKey=data.getKey();
		     } 
		}	
		 System.out.println(maxKey);
	     System.out.println(maxVal);
	    	
	}

}
