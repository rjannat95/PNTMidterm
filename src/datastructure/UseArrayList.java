package datastructure;
import java.util.*;
import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<String> list = new ArrayList<String>();
		list.add("Bangladesh");
		list.add("USA");
		list.add("Canada");
		list.add("Korea");
		list.add("Thailand");

		System.out.println(list);

		list.add(3, "Pakistan");

		System.out.println(list);

		list.set(4,"NorthKorea" );

		System.out.println(list);
		list.remove(4);

		System.out.println(list);

		System.out.println(list.get(4));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		List<Object> list1 = new ArrayList<Object>();
		list1.add(89);
		list1.add(9.786);
		list1.add('$');
		list1.add(false);
		list1.add("Sentence");

		System.out.println(list1);

		Iterator it = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());

	}

}















