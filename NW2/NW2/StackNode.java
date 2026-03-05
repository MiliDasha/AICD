public class StackNode {
    private StackNode before;
    private final int value;

    public StackNode(int value) {
        this.value = value;
    }

    public StackNode(int value, StackNode before) {
        this.value = value;
        this.before = before;
    }

    public int getValue() {
        return this.value;
    }

    public StackNode getBefore() {
        return this.before;
    }

    public void setBefore(StackNode before) {
        this.before = before;
    }
}
