public class DequeueMain {

    public static void main(String[] args) {
        // Create a deque with a size of 5
        Dequeue myDeque = new Dequeue(5);

        // Insert elements from both ends
        myDeque.insertRight(10);
        myDeque.insertLeft(20);
        myDeque.insertRight(30);

        // Print the current state of the deque
        System.out.println("Deque after insertions:");
        myDeque.printDeque();

        // Remove elements from both ends
        myDeque.removeLeft();
        myDeque.removeRight();

        // Print the current state of the deque
        System.out.println("Deque after removals:");
        myDeque.printDeque();

        // Check if the deque is empty or full
        System.out.println("Is deque empty? " + myDeque.isEmpty());
        System.out.println("Is deque full? " + myDeque.isFull());

        // Get the current size of the deque
        System.out.print("Deque size: ");
        myDeque.getSize();
    }
}
