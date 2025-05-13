import org.apache.commons.collections4.list.CursorableLinkedList;

public class Main {
    public static void main(String[] args) {
        CursorableLinkedList<Integer> list = new CursorableLinkedList<>();
        /* write */ list.add(42);
        /* read */ int value = list.get(0);
        System.out.println(value);
    }
}