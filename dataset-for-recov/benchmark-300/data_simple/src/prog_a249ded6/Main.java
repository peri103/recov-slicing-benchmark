import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        /* write */ list.addLast(42);
        /* read */ int value = (Integer) list.getLast();
        System.out.println(value);
    }
}