public class Stack {
    private StackNode root;
    private int size;

    public Stack() {
        this.size = 0;
    }

    public void add(StackNode node) {
        node.setBefore(this.root);
        this.root = node;
        this.size++;
    }

    public StackNode remove() {
        if (this.root == null) {
            return null;
        }
        StackNode result = this.root;
        this.root = root.getBefore();
        this.size--;
        return result;
    }

    public int getSize() {
        return this.size;
    }
}
