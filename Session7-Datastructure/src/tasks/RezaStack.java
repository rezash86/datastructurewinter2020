package tasks;

import java.util.ArrayList;

public class RezaStack<T> {

	ArrayList<T> arr = new ArrayList<T>();

	public T push(T item) {
		arr.add(item);
		return item;
	}

	public T pop() {
		int size = arr.size();
		T item = arr.get(size - 1);
		arr.remove(size - 1);
		return item;
	}

	public boolean isEmpty() {
		return arr.size() == 0;
	}
}
