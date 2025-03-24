import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        /* write */ list.add(1);
        /* read */ int value = (Integer) list.get(0);
        System.out.println(value);
    }
}