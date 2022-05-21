package datastructure;
import java.util.*;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Integer> queue = new PriorityQueue<>();

		queue.add(52);
		queue.add(96);
		queue.add(42);
		queue.add(55);
		queue.add(65);
		queue.add(99);
		System.out.println(queue);
		queue.remove(52);
		System.out.println(queue);
		queue.peek();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
	}

}
