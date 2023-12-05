public class Dequeue {

    private int maxSize;
    private long[] dequeArray;
    private int front;
    private int rear;
    private int nItems;

    public Dequeue(int size) { // constructor
        maxSize = size;
        dequeArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;

    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public void getSize() {
        System.out.println(this.nItems);
    }

    public void printDeque() {
        for (int i = 0; i < maxSize; i++) {
            System.out.print(this.dequeArray[i] + " ");
        }
        System.out.println();
    }

    public void insertRight(long key) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }

        if (rear == dequeArray.length - 1) {
            rear = -1;
        }

        dequeArray[++rear] = key;
        nItems++;
    }

    public void insertLeft(long key) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }

        if (front == 0) {
            front = dequeArray.length - 1;
        } else {
            front--;
        }

        dequeArray[front] = key;
        nItems++;
    }

    public boolean removeRight() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return false;
        }

        dequeArray[rear] = 0;

        if (front == rear) {
            front = 0;
            rear = -1;
        } else {
            if (rear == 0) {
                rear = dequeArray.length - 1;
            } else {
                rear--;
            }
        }

        nItems--;
        return true;
    }

    public boolean removeLeft() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return false;
        }

        dequeArray[front] = 0;

        if (front == rear) {
            front = 0;
            rear = -1;
        } else {
            if (front == dequeArray.length - 1) {
                front = 0;
            } else {
                front++;
            }
        }

        nItems--;
        return true;
    }
}

