package learning;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();

        binarySearchTree.insert(new Node<>(10));
        binarySearchTree.insert(new Node<>(5));
        binarySearchTree.insert(new Node<>(2));
        binarySearchTree.insert(new Node<>(6));
        binarySearchTree.insert(new Node<>(7));
        binarySearchTree.insert(new Node<>(8));
        binarySearchTree.insert(new Node<>(4));
        binarySearchTree.insert(new Node<>(1));
        binarySearchTree.insert(new Node<>(9));

        binarySearchTree.display();

        System.out.println();

        binarySearchTree.remove(5);
        binarySearchTree.display();


    }
}



