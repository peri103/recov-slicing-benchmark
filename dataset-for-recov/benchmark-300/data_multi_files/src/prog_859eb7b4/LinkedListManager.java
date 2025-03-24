import java.util.LinkedList;
import java.util.Random;

public class LinkedListManager {
    private LinkedList<Integer> list = new LinkedList<>();

    public void addRandomNumbers(int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt(100));
        }
    }

    public void modifyList() {
        list.removeFirst();
        list.addLast(99);
        list.addFirst(1);
    }

    public LinkedList<Integer> getList() {
        return list;
    }
}
