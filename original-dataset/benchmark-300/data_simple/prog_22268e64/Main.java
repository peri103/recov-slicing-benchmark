import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        /* write */ list.addFirst(1);
        /* read */ int value = (Integer) list.getFirst();
        System.out.println(value);
    }
}