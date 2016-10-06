
public class Palindrome2 {

	public static void main(String[] args) {

		System.out.println("Enter a string to check to see if it is a palindrome or not ");
		String[] s = StdIn.readLine().split("");

		int l = s.length;

		StackOfChar charStack = new StackOfChar(l);
		QueueOfChar charQueue = new QueueOfChar(l);

		for (int i = 0; i < s.length; i++) {
			charStack.push(s[i]);
			charQueue.enqueue(s[i]);
		}

		while (!charStack.empty()) {
			String s1 = charStack.pop();
			String s2 = charQueue.dequeue();

			System.out.println("charStack pop is " + s1);
			System.out.println("charQueue dequeue is " + s2);

			if (!s1.equals(s2)) {
				System.out.println("The word is NOT a palindrome");
				return;
			}
		}
		System.out.println("The word is a palindrome");
	}

}
