package custom;

import java.util.Arrays;

public class CustomArrayList<E> {

	private static final int INITIAL_CAPACITY = 10;

	private int size = 0;
	private Object elements[];

	public CustomArrayList() {
		elements = new Object[INITIAL_CAPACITY];
	}

	public void add(E element) {
		if (size == elements.length) {
			ensureCapacity();
		}
		elements[size++] = element;
	}

	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		return (E) elements[index];
	}

	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		for (int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		size--;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(elements[i] + " ");
		}
	}

	private void ensureCapacity() {
		int newCapacity = INITIAL_CAPACITY * 2;
		elements = Arrays.copyOf(elements, newCapacity);
	}

}
