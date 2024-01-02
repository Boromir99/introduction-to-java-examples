package learning;

public class BinarySearchTree<T extends Comparable<T>> {


    private Node<T> root;

    private int height(Node<T> node){
        if (node == null){
            return 0;
        }
        return node.height;
    }

    private int balanceFactor(Node<T> node){
        if (node == null){
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    private void updateHeight(Node<T> node){
        if (node != null){
            node.height = 1 + Math.max(height(node.left), height(node.right));
        }
    }

    private Node<T> rightRotate(Node<T> y){
        Node<T> x = y.left;
        Node<T> T2 = x.right;

        x.right = y;
        y.left = T2;

        updateHeight(y);
        updateHeight(x);

        return x;
    }

    private Node<T> leftRotate(Node<T> x) {
        Node<T> y = x.right;
        Node<T> T2 = y.left;

        y.left = x;
        x.right = T2;

        updateHeight(x);
        updateHeight(y);

        return y;
    }

    public void insert(Node<T> node) {
        root = insertHelper(root, node);
    }

    private Node<T> insertHelper(Node<T> root, Node<T> node) {
        T data = node.data;

        if (root == null) {
            root = node;
            return root;

        } else if (data.compareTo(root.data) < 0) {
            root.left = insertHelper(root.left, node);

        } else if (data.compareTo(root.data) > 0) {
            root.right = insertHelper(root.right, node);

        } else {
            return root;
        }

        updateHeight(root);
        int balance = balanceFactor(root);

        // Left Left Case
        if (balance > 1 && node.data.compareTo(root.left.data) < 0) {
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && node.data.compareTo(root.right.data) > 0) {
            return leftRotate(root);
        }

        // Left Right Case
        if (balance > 1 && node.data.compareTo(root.left.data) > 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Left Case
        if (balance < -1 && node.data.compareTo(root.right.data) < 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public void display() {
        displayHelper(root);
    }

    private void displayHelper(Node<T> root) {

        if (root != null) {
            System.out.print(root.data + " ");
            displayHelper(root.left);
            displayHelper(root.right);
        }
    }

    public boolean search(T data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node<T> root, T data) {

        if (root == null) {
            return false;
        } else if (root.data.compareTo(data) == 0) {
            return true;
        } else if (root.data.compareTo(data) > 0) {
            return searchHelper(root.left, data);
        } else return searchHelper(root.right, data);
    }

    public void remove(T data) {

        if (search(data)) {
            removeHelper(root, data);
        } else System.out.println(data + " could not be found");
    }

    private Node<T> removeHelper(Node<T> root, T data) {

        if (root == null) {
            return null;
        } else if (data.compareTo(root.data) < 0) {
            root.left = removeHelper(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = removeHelper(root.right, data);
        } else { // node found
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.right != null) { // find a successor to replace
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            } else {
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }


    private T successor(Node<T> root) {
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    private T predecessor(Node<T> root) {

        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }
}
