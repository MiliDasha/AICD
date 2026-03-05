public class Queue {
    private QueueNode head;
    private QueueNode tail;
    private int size;

    public void enqueue(QueueNode node) {
        if (this.tail != null) {
            this.tail.setNext(node);
        }
        this.tail = node;
        if (this.head == null) {
            this.head = node;
        }
        this.size++;
    }

    public QueueNode dequeue() {
        if (this.head == null) {
            return null;
        }
        QueueNode result = this.head;
        this.head = this.head.getNext();
        if (this.head == null) {
            this.tail = null;
        }
        this.size--;
        result.setNext(null);
        return result;
    }

    public QueueNode peek() {
        return this.head;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
}

