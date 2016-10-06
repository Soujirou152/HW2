
public class StackOfChar {
	private String[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	/** Construct a stack with the default capacity 16 */
	public StackOfChar() {
		this(DEFAULT_CAPACITY);
	}

	/** Construct a stack with the specified maximum capacity */
	public StackOfChar(int capacity) {
		elements = new String[capacity];
	}

	/** Push a new integer into the top of the stack */
	public void push(String value) {
		if (size >= elements.length) {
			String[] temp = new String[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = value;
	}

	/** Return and remove the top element from the stack */
	public String pop() {
		return elements[--size];
	}

	/** Return the top element from the stack */
	public String peek() {
		return elements[size - 1];
	}

	/** Test whether the stack is empty */
	public boolean empty() {
		return size == 0;
	}

	/** Return the number of elements in the stack */
	public int getSize() {
		return size;
	}

}
