import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        /* write */ list.add(42);
        /* read */ int value = list.get(0);
        System.out.println(value);
    }
}