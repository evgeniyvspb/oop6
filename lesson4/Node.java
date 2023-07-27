package lesson4;

public class Node<T> {
    T currentElement;
    Node<T> nextElement;
    Node<T> prevElement;

    public Node(Node<T> prev,T value, Node<T> next) {
        this.currentElement = value;
        this.nextElement = next;
        this.prevElement=prev;
    }

    public Node(T value) {
        this(null, value, null);

    }

    public Node() {
        this(null,null,null);
    }

}