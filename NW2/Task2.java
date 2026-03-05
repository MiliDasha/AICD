public class Task2 {
    public static Queue MergeMethod(Queue q1, Queue q2) {
        Queue result = new Queue();

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek().getValue() <= q2.peek().getValue()) {
                result.enqueue(new QueueNode(q1.dequeue().getValue()));
            } else {
                result.enqueue(new QueueNode(q2.dequeue().getValue()));
            }
        }

        while (!q1.isEmpty()) {
            result.enqueue(new QueueNode(q1.dequeue().getValue()));
        }

        while (!q2.isEmpty()) {
            result.enqueue(new QueueNode(q2.dequeue().getValue()));
        }

        return result;
    }
}

