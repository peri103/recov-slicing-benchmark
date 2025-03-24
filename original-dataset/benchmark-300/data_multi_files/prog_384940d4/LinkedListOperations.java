import java.util.LinkedList;

public class LinkedListOperations {
    private LinkedList<Integer> list = new LinkedList<>();

    public void addElement(int element) {
        /* write */ list.addLast(element);
    }

    public int getLastElement() {
        /* read */ return list.getLast();
    }

    public LinkedList<Integer> getList() {
        return list;
    }
}
