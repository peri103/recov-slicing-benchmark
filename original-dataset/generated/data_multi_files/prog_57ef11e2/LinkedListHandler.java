import java.util.LinkedList;

public class LinkedListHandler {
    private LinkedList<Integer> list = new LinkedList<>();

    public void addFirstElement(int element) {
        /* write */ list.addFirst(element);
    }

    public int getFirstElement() {
        /* read */ return list.getFirst();
    }

    public void addLastElement(int element) {
        list.addLast(element);
    }

    public void removeFirstElement() {
        list.removeFirst();
    }

    public void removeLastElement() {
        list.removeLast();
    }

    public int getSize() {
        return list.size();
    }
}
