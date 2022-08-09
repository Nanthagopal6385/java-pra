package Com.org;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class REpeatative_Charater {

	public static void main(String[] args) {

		String s = "of the people by the people foe the people"; // Immutable

		String[] words = s.split(" ");

		Map<String, Integer> map = new LinkedHashMap<String, Integer>(); // upcasting

		for (String word1 : words) {

			if (map.containsKey(word1)) {

				Integer value = map.get(word1);

				map.put(word1, value + 1);
			} else {

				map.put(word1, 1);

			}
		}

		System.out.println("Map");

		Set<Entry<String, Integer>> entryset = map.entrySet();

		for (Entry<String, Integer> entry : entryset) {

			if (entry.getValue() > 1) {

				System.out.println(entry);
			}
		}
	}

}
