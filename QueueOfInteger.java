import java.util.ArrayList;

/**
 * Describe this class using Java doc here...
 * 
 * 
 * 
 * @author Pengxue Her
 *
 */
public class QueueOfInteger {
	private Integer[] elements;
	private int size;

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

	public void enqueue(int v) {
		if (size >= elements.length) {
			Integer[] temp = new Integer[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = v;
	}

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
