import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        /* write */ list.add("Hello");
        /* read */ String value = list.get(0);
        System.out.println(value);
    }
}