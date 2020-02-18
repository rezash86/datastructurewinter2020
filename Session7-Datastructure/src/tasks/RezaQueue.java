package tasks;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class RezaQueue<E> {
	
	LinkedList<E> list = new LinkedList<E>();
	
	public void enqueue(E item) {
		if(item != null) {
			list.add(item);
		}
		
	}
	
	public E dequeue() {
		if(list.isEmpty()) {
			throw new EmptyStackException();
		}
		return list.getFirst();
		
	}
	
	public boolean isEmpty() {
		return list.size() == 0;
		
	}
}
