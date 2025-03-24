import java.util.LinkedList;
import java.util.Random;

public class LinkedListManager {
    private LinkedList<Integer> linkedList = new LinkedList<>();
    private Random random = new Random();

    public void initializeList() {
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(100));
        }
    }

    public void modifyList() {
        linkedList.removeFirst();
        linkedList.addLast(random.nextInt(100));
    }

    public LinkedList<Integer> getLinkedList() {
        return linkedList;
    }

    public int calculateSum() {
        int sum = 0;
        for (Integer num : linkedList) {
            sum += num;
        }
        return sum;
    }
}
