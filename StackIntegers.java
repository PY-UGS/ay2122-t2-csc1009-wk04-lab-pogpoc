package Pract4;

public class StackIntegers {

	private int[] elements;
	private int size;

	public StackIntegers() {
		this.size = -1;
		this.elements = new int[20];
	}

	public StackIntegers(int size) {
		this.elements = new int[size];
		this.size = -1;
	}

	public boolean isEmpty() {
		return this.size == -1;
	}

	public int peek() {
		return elements[this.size];
	}

	public void push(int value) {
		this.size++;
		elements[this.size] = value;
	}

	public int pop() {
		int poppedVal = elements[this.size];
		this.size--;
		return poppedVal;
	}

	public int getSize() {
		return this.size;
	}

}
