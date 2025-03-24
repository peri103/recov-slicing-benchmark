import java.util.LinkedList;

public class LinkedListOperations {
    private LinkedList<Integer> linkedList = new LinkedList<>();

    public void addFirst(int value) {
        /* write */ linkedList.addFirst(value);
    }

    public int getFirst() {
        return linkedList.getFirst();
    }

    public LinkedList<Integer> getLinkedList() {
        return linkedList;
    }
}
