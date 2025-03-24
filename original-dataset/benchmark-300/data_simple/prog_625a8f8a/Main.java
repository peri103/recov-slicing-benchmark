import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        /* write */ list.add(1);
        /* read */ int value = (Integer) list.get(0);
        System.out.println(value);
    }
}