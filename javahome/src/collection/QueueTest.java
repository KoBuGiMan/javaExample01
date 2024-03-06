package collection;

import java.util.Deque;
import java.util.LinkedList;

public class QueueTest {

	public static void main(String[] args) {
//		Queue<String> queue = new LinkedList<>();
//
//		queue.add("Take 1");
//		queue.add("Take 2");
//
//		System.out.println(queue.element());

		Deque<String> que = new LinkedList<>();
		que.offer("Take 2");
		que.offer("Take 3");
		que.addFirst("Take 1");
		que.offerFirst("Take 0");
		
		System.out.println(que.poll());
		System.out.println(que);

		for(String q : que) {
			System.out.println(q);
		}
		
	}

}
