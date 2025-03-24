import java.util.LinkedList;
import java.util.ArrayList;

public class DataProcessor {
    private LinkedList<Integer> linkedList = new LinkedList<>();
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public void addToLinkedList(int element) {
        linkedList.add(element);
    }

    public void addToArrayList(int element) {
        arrayList.add(element);
    }

    public LinkedList<Integer> getLinkedList() {
        return linkedList;
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }
}
