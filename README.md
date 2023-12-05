# Dequeue Implementation in Java

The provided code implements a double-ended queue (deque) in Java. This deque supports insertion and removal operations from both ends, and it includes methods to check whether the deque is full or empty, get the size, and print the current state of the deque.

Here's a short description:

## Dequeue Class

Welcome to the Dequeue class, a Java implementation of a double-ended queue (deque). This deque allows you to insert and remove elements from both the front and rear ends. Additionally, you can check if the deque is full or empty, get its size, and print its current state.

## Usage

1. **Initialization**: Create a new Dequeue object by providing the desired size.

2. **Operations**:
   - `insertRight(long key)`: Insert an element at the rear end.
   - `insertLeft(long key)`: Insert an element at the front end.
   - `removeRight()`: Remove an element from the rear end.
   - `removeLeft()`: Remove an element from the front end.

3. **Utility Methods**:
   - `isFull()`: Check if the deque is full.
   - `isEmpty()`: Check if the deque is empty.
   - `getSize()`: Get the current size of the deque.
   - `printDeque()`: Print the current state of the deque.

## Example

```java
// Create a deque with a size of 5
Dequeue myDeque = new Dequeue(5);

// Insert elements from both ends
myDeque.insertRight(10);
myDeque.insertLeft(20);

// Remove elements from both ends
myDeque.removeRight();
myDeque.removeLeft();

// Print the current state of the deque
myDeque.printDeque();
```

## Contributing

Feel free to contribute by forking the repository, making changes, and submitting a pull request. Your feedback and improvements are welcome!

## License

This project is licensed under the [MIT License](LICENSE). Use it, modify it, and share it as needed.
