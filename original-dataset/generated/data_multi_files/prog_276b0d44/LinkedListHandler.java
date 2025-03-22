import java.util.LinkedList;

public class LinkedListHandler {
    private LinkedList<Integer> list = new LinkedList<>();

    public void addToEnd(int value) {
        /* write */ list.addLast(value);
    }

    public int getLastValue() {
        return list.getLast();
    }

    public void printAllValues() {
        for (Integer num : list) {
            System.out.println("LinkedList Element: " + num);
        }
    }
}
