import java.util.ArrayList;
import java.util.LinkedList;

public class DataProcessor {
    private ArrayList<Integer> list = new ArrayList<>();
    private LinkedList<Integer> linkedList = new LinkedList<>();

    public void populateData() {
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public LinkedList<Integer> getLinkedList() {
        return linkedList;
    }
}
