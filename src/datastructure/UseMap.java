package datastructure;
import java.util.*;
import java.util.Map.Entry;

import static java.lang.System.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "New York");
		map.put(2, "London");
		map.put(3, "Queens");
		map.put(4, "Bronx");
		map.put(5, "Long Island City");
		System.out.println(map);
		System.out.println(map.get(3));
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
	}

}
