package Collections;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueList {

	public static void main(String[] args) {

		Queue<Integer> Q = new LinkedBlockingQueue<>(8);

		Q.add(11);
		Q.add(12);
		Q.add(13);
		Q.add(14);
		Q.add(15);
		Q.add(16);
		Q.add(17);
		Q.add(18);
		Q.poll();//Remove Q.add(11);
		Q.offer(3);//Insert
		
	
		for (Integer element : Q) {
			System.out.println(element);
		}
		System.out.println("*******************");
		System.out.println("this peek will give Queue first value: " +  Q.peek() );	
		Q.peek();
		
		System.out.println("*******************");
		System.out.println("THIS IS FOR DEQUE");
		Deque<Integer> D = new LinkedBlockingDeque<>();
		D.offer(121);
		D.addFirst(12);
		D.removeLast();
		
		for (Integer element : D) {
			System.out.println(element);
		}
	}
}
//
//try {
//	Q.add(11);
//	Q.add(12);
//	Q.add(13);
//	Q.add(14);
//	Q.add(15);
//	Q.add(16);
//	Q.add(17);
//	Q.add(18);
//} catch (IllegalStateException e) {
//	System.out.println(" it is Full");
//}

//QueueList.java:21 
//QueueList.java:10
