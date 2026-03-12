public class Tree<T extends Comparable<T>> {
    private TreeNode<T> root;
    private int height;

    public Tree() {
        this.root = null;
        this.height = 0;
    }

    public Tree(TreeNode<T> root) {
        this.root = root;
        this.height = 1;
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public int getHeight() {
        return height;
    }

    public void add(T value) {
        TreeNode<T> node = new TreeNode<>(value);
        if (this.root == null) {
            this.root = node;
        } else {
            add(this.root, value);
        }
        this.height = height();
    }

    private void add(TreeNode<T> current, T value) {
        if (current.getValue().compareTo(value) > 0) {
            if (current.getLeft() == null) {
                current.setLeft(new TreeNode<>(value));
            } else {
                add(current.getLeft(), value);
            }
        } else if (current.getValue().compareTo(value) <= 0) {
            if (current.getRight() == null) {
                current.setRight(new TreeNode<>(value));
            } else {
                add(current.getRight(), value);
            }
        }
    }

    public void preOrder() { // Прямой обход: Корень -> Левое -> Правое
        System.out.print("Прямой обход: ");
        traversal(root, "pre");
        System.out.println();
    }

    public void inOrder() { // Симметричный обход: Левое -> Корень -> Правое
        System.out.print("Симметричный обход: ");
        traversal(root, "in");
        System.out.println();
    }


    public void postOrder() { // Обратный обход: Левое -> Правое -> Корень
        System.out.print("Обратный обход: ");
        traversal(root, "post");
        System.out.println();
    }

    private void traversal(TreeNode<T> node, String order) {
        if (node == null) {
            return;
        }

        switch (order) {
            case "pre":  // Прямой обход
                System.out.print(node.getValue() + " ");
                traversal(node.getLeft(), order);
                traversal(node.getRight(), order);
                break;

            case "in":   // Симметричный обход
                traversal(node.getLeft(), order);
                System.out.print(node.getValue() + " ");
                traversal(node.getRight(), order);
                break;

            case "post": // Обратный обход
                traversal(node.getLeft(), order);
                traversal(node.getRight(), order);
                System.out.print(node.getValue() + " ");
                break;
        }
    }

    public void remove(T value) {
        this.root = remove(this.root, value);
        this.height = height();
    }

    private TreeNode<T> remove(TreeNode<T> current, T value) {
        if (current == null) {
            return null;
        }

        int compare = value.compareTo(current.getValue());
        if (compare < 0) {
            current.setLeft(remove(current.getLeft(), value));
            if (current.getLeft() != null) {
                current.getLeft().setParent(current);
            }
        } else if (compare > 0) {
            current.setRight(remove(current.getRight(), value));
            if (current.getRight() != null) {
                current.getRight().setParent(current);
            }
        } else {
            if (current.getLeft() == null) {
                if (current.getRight() != null) {
                    current.getRight().setParent(current.getParent());
                }
                return current.getRight();
            }
            if (current.getRight() == null) {
                if (current.getLeft() != null) {
                    current.getLeft().setParent(current.getParent());
                }
                return current.getLeft();
            }

            //eсть оба ребенка
            T smallestValue = findMin(current.getRight());
            current.setValue(smallestValue);
            current.setRight(remove(current.getRight(), smallestValue));
            if (current.getRight() != null) {
                current.getRight().setParent(current);
            }
        }
        return current;
    }

    private T findMin(TreeNode<T> node) {
        if (node == null) return null;
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node.getValue();
    }

    private T findMax(TreeNode<T> node) {
        if (node == null) return null;
        while (node.getRight() != null) {
            node = node.getRight();
        }
        return node.getValue();
    }

    public TreeNode<T> get(T value) {
        TreeNode<T> current = root;
        while (current != null) {
            int compare = value.compareTo(current.getValue());
            if (compare == 0) {
                return current;
            } else if (compare < 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        return null;
    }

    public int height() {
        return height(this.root);
    }
    private int height(TreeNode<T> node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.getLeft());
        int rightHeight = height(node.getRight());
        return Math.max(leftHeight,rightHeight) + 1;
    }
}