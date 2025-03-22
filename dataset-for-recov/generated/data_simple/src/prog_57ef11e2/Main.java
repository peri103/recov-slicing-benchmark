import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        /* write */ list.addFirst(42);
        /* read */ int value = list.getFirst();
        System.out.println(value);
    }
}