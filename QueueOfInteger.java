import java.util.ArrayList;

/**
 * QueueOfInteger creates an array that stores integers and pops them out in a
 * first in first out style unlike the StackOfInteger class that pops out
 * integers as a last in first out style
 * 
 * @author Pengxue Her
 */
public class QueueOfInteger {
	private Integer[] elements;
	private int size;

	/** This method returns the int variable size of the queue */
	public int getSize() {
		return size;
	}

	public static final int DEFAULT_CAPACITY = 8;

	/** Construct a queue with the default capacity 8 */
	public QueueOfInteger() {
		this(DEFAULT_CAPACITY);
	}

	/** Construct a queue with the specified maximum capacity */
	public QueueOfInteger(int capacity) {
		this.elements = new Integer[capacity];
	}

	/** enqueue adds an int, v, to the queue */
	public void enqueue(int v) {
		if (size >= elements.length) {
			Integer[] temp = new Integer[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = v;
	}

	/**
	 * dequeue outputs the first number in the queue and also removes that
	 * number
	 */
	public int dequeue() {
		int firstOut = elements[0];
		Integer[] temp = new Integer[(elements.length * 2)];
		System.arraycopy(elements, 1, temp, 0, --size);
		elements = temp;
		return firstOut;
	}

	/** Test whether the stack is empty */
	public boolean empty() {
		return size == 0;
	}

	// Finish this by adding requested methods .
	// Be sure to add Java doc comments /** ... */
	// just before each method except main()

	public static void main(String[] args) {
		//
		QueueOfInteger queue = new QueueOfInteger();
		for (int i = 1; i <= 20; i++) {
			queue.enqueue(i);

		}
		while (!queue.empty()) {
			System.out.println("The size is " + queue.getSize());
			System.out.println(queue.dequeue() + " ");
		}
		System.out.println("The size is " + queue.getSize());
	}

}
