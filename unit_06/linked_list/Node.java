package linked_list;

public class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> prev;

    Node(T data) {
        this.data = data;
        next = null;
        prev = null;
    }

    Node(T data, Node<T> p) {
        this.data = data;
        prev = p;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public Node<T> getNext() {
        return next;
    }
    public void setPrev(Node<T> d) {
        prev = d;
    }

    public void setNext(Node<T> li) {
        next = li;
    }
}
