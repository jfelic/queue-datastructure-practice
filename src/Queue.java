public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int item) {
        if(rear == maxSize - 1) { //Warp around
            rear = -1;
        }
        rear++;
        queueArray[rear] = item;

        if(nItems < maxSize) {
            nItems++;
        } else {
            System.out.println("Queue is full");
        }
    }

    public int remove() {
        if(front == maxSize) {
            front = 0;
        }
        int temp = queueArray[front];
        front++;
        nItems--;
        return temp;
    }

    public int peek() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }
}
