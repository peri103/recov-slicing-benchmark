import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        /* write */ deque.addLast(42);
        /* read */ int value = deque.getLast();
        System.out.println(value);
    }
}