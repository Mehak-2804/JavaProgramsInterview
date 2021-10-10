package StringIQ;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			String s = "Mehak Is A Girl";
			s= s.toLowerCase();
			s=s.replace(" ", "");
			char y[]=s.toCharArray();
		
			int size=y.length;
			Map<Character,Integer> map = new LinkedHashMap<>();
			int i =0;
			while(i!=size)
			{
				if(map.containsKey(y[i])==false)
				{
					map.put(y[i],1);
				}
				else
				{
					int oldval=map.get(y[i]);
					int newval=oldval+1;
					map.put(y[i], newval);
				}
				i++;
			}
			
			Set<Map.Entry<Character,Integer>> lmap = map.entrySet();
			for(Map.Entry<Character, Integer> data : lmap)
			{
				if(data.getValue()>1)
				{
					System.out.print(data.getKey() + "" + data.getValue());
					
					//System.out.print(data.getValue());
				}
			}
	}
}
