package learning;

public class Node<T extends Comparable<T>> {

    T data;
    int height;
    Node<T> left, right;

    public Node(T data){
        this.data = data;
        this.height = 1;
    }

}
