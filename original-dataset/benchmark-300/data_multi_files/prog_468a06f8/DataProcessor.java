import java.util.ArrayList;
import java.util.LinkedList;

public class DataProcessor {
    private ArrayList<Integer> list = new ArrayList<>();
    private LinkedList<Integer> linkedList = new LinkedList<>();

    public void addToList(int value) {
        list.add(value);
    }

    public void addToLinkedList(int value) {
        linkedList.add(value);
    }

    public void processData() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }
    }
}
