public class Main2inNW {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.enqueue(new QueueNode(1));
        q1.enqueue(new QueueNode(3));
        q1.enqueue(new QueueNode(5));

        Queue q2 = new Queue();
        q2.enqueue(new QueueNode(2));
        q2.enqueue(new QueueNode(4));
        q2.enqueue(new QueueNode(6));

        Queue mergedQueue = Task2.MergeMethod(q1, q2);

        System.out.print("Результат слияния: ");
        while (!mergedQueue.isEmpty()) {
            System.out.print(mergedQueue.dequeue().getValue() + " ");
        }
        System.out.println();
    }
}