package JavaInterviewPractice2021;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateStringInArray {

	public static void main(String[] args) {

		// brute force method
		// HashSet
		// HashMap
		// Streams -> filter , frequency

		String infra[] = { "Mehak", "C", "Mehak", "Hello", "C", "Amazon", "Amazon" };
		// output : C, Mehak, Amazon
		
		System.out.println(">>>>> brute force >>>>>>>");

		for (int i = 0; i < infra.length; i++) {
			for (int j = i + 1; j < infra.length; j++) {
				if (infra[i].equals(infra[j])) {
					System.out.println(infra[i]);
				}
			}
		}

		System.out.println();
		System.out.println(">>>>>> HashSet Method >>>>>>");

		Set<String> dupSet = new HashSet<String>(); // create an object of HashSet
		for (String e : infra) { // start for loop to iterate through array
			if (dupSet.add(e) == false) { // if object of Set is not empty
				System.out.println(e);
			}
		}

		System.out.println();
		System.out.println(">>>>>> HashMap Method >>>>>>");

		Map<String, Integer> map = new HashMap<String, Integer>(); // create an object of HashMap

		for (String e : infra) {
			Integer count = map.get(e);
			if (count == null) {
				map.put(e, 1);
			} else {
				map.put(e, ++count);
			}
		}

		// print all duplicate elements

		Set<Map.Entry<String, Integer>> setMap = map.entrySet();
		for (Map.Entry<String, Integer> data : setMap) {

			if (data.getValue() > 1) {
				System.out.println(data.getKey());
			}
		}

		System.out.println();
		System.out.println(">>>>>> Stream filter Method >>>>>>");

		// will create Hashset as it stores unique values

		Set<String> hashSet = new HashSet<String>();
		Set<String> duplSet = Arrays.asList(infra).stream().filter(e -> !hashSet.add(e)).collect(Collectors.toSet());
		System.out.println(duplSet);

		
		System.out.println();
		System.out.println(">>>>>> Stream frequency Method >>>>>>");

		List<String> list = Arrays.asList(infra);

		Set<String> eList = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());

		System.out.println(eList);

	}
}
