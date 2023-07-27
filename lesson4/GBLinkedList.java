package lesson4;

import java.util.Iterator;

public class GBLinkedList<T> implements GBList<T> {
    private Node<T> fstNode;
    private Node<T> lstNode;
    private int size = 0;

    public GBLinkedList() {
        this.fstNode = null;
        this.lstNode = null;
        this.size = 0;
    }

    @Override
    public boolean add(T value) {
        Node<T> node = new Node<T>(value);
        if (this.size == 0) {
            this.fstNode = node;
            this.lstNode = this.fstNode;
        } else {
            this.lstNode.nextElement = node;
            this.lstNode = node;
        }
        this.size++;
        return true;
    }

    @Override
    public boolean add(int index, T value) {
        Node<T> insertedNode = new Node<T>(value);
        if (index == 0) {
            insertedNode.nextElement = this.fstNode;
            this.fstNode = insertedNode;
            if (this.lstNode == null)
                this.lstNode = insertedNode;
        } else if (index == size) {
            this.lstNode.nextElement = insertedNode;
            this.lstNode = insertedNode;
        } else {
            Node<T> previousNode = getNodeOfIndex(index - 1);
            insertedNode.nextElement = previousNode.nextElement;
            previousNode.nextElement = insertedNode;
        }
        this.size++;
        return true;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(this.toArray());
    }

    @SuppressWarnings("unchecked")
    @Override
    public T[] toArray() {
        T[] array;
        try {
            array = (T[]) new Object[this.size];
            int i = 0;
            Node<T> node = this.fstNode;
            while (i < this.size) {
                array[i] = node.currentElement;
                node = node.nextElement;
                i++;
            }
        } catch (ClassCastException e) {
            throw new RuntimeException();
        }
        return array;
    }

    @Override
    public String toString() {
        if (this.fstNode == null)
            return "{}";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        Node<T> node = this.fstNode;
        stringBuilder.append(node.currentElement);
        while (node.nextElement != null) {
            node = node.nextElement;
            stringBuilder.append(", ");
            stringBuilder.append(node.currentElement);
        }
        stringBuilder.append("}");

        return stringBuilder.toString();
    }
    
    @Override
    public Node<T> getNodeOfIndex(int index) {
        int i = 0;
        Node<T> currentNode = this.fstNode;
        while (i < index) {
            currentNode = currentNode.nextElement;
            i++;
        }
        return currentNode;
    }
}
