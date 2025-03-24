import java.util.LinkedList;

public class LinkedListReader {
    private LinkedList<Integer> list;

    public LinkedListReader(LinkedList<Integer> list) {
        this.list = list;
    }

    public int readValue() {
        /* read */ return list.get(0);
    }
}
