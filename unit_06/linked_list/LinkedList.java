package linked_list;

public class LinkedList<T> {
    private int size;
    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    public LinkedList(T data) {
        head = new Node<T>(data);
        tail = head;
        size = 1;
    }

    public void add(T data) {
        var li = new Node<T>(data);
        li.setNext(null);
        if (size >0) {
            li.setPrev(tail);
            tail.setNext(li);
        }
        else {
            head = li;
        }
        tail = li;
        size++;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public Node<T> get(int i) {
        if (i> size) {
            return null;
        }
        else {
            Node<T> li = head;
            for (int j=1; j<i; j++) {
                li = li.getNext();
            }
            return li;
        }
    }

    public void remove(int i) {
        if (i <= size) {
            var li = get(i);
            var prev = li.getPrev();
            var next = li.getNext();
            if (prev != null) {
                prev.setNext(next);
            }
            if (next != null) {
                next.setPrev(prev);
                if (i == 1) {
                    head = next;
                }
            }
            size--;
        }
    }

    public void swap(int i, int j) {
        if ((i <= size) && (j <= size) && (i < j)) {
            var li1 = get(i);
            var li2 = get(j);
            T buf = li1.getData();
            li1.setData(li2.getData());
            li2.setData(buf);
        }
    }
}
