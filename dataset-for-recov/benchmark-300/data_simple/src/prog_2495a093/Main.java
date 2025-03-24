import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        /* write */ list.add(42);
        /* read */ int value = list.get(0);
        System.out.println(value);
    }
}