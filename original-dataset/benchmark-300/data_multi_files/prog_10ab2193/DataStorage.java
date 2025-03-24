import java.util.ArrayList;
import java.util.LinkedList;

public class DataStorage {
    private ArrayList<Integer> list = new ArrayList<>();
    private LinkedList<Integer> linkedList = new LinkedList<>();

    public void addToList(int value) {
        list.add(value);
    }

    public void addToLinkedList(int value) {
        linkedList.add(value);
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public LinkedList<Integer> getLinkedList() {
        return linkedList;
    }
}
