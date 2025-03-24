import java.util.LinkedList;
import java.util.Random;

public class LinkedListManager {
    private LinkedList<Integer> linkedList = new LinkedList<>();
    private Random random = new Random();

    public void generateRandomNumbers(int count) {
        for (int i = 0; i < count; i++) {
            linkedList.add(random.nextInt(100));
        }
    }

    public LinkedList<Integer> getLinkedList() {
        return linkedList;
    }

    public void moveFirstToEnd() {
        linkedList.addLast(linkedList.removeFirst());
    }
}
