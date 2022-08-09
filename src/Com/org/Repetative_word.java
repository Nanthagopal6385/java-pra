package Com.org;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetative_word {
	
	private static Entry[] entrySet;

	public static void main(String[] args) {
		
		String s ="of the people by the people for te people";  //immutable
		
		String [] words = s.split(" ");
		
		Map<String,Integer> map = new LinkedHashMap<String, Integer>();  //upcasting
		
		for (String word : words) {
			
			if (map.containsKey(word)) {
				
				Integer Value = map.get(words);
				
				map.put(word, Value + 1);
				
			}
			
			else {
				map.put(word, 1);
				
			}
			
		}
		
		System.out.println(map);
		
		Set<Entry<String,Integer>> entryset = map.entrySet();  //to iterate the map
		
		for (Entry<String,Integer> entry : entryset)
		
		
		{
			if(entry.getValue() > 1)
				
			{
				System.out.println(entry);
			}
		}
		
	}

}
