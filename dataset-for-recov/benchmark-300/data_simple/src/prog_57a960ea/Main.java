import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        /* write */ list.addLast("Hello, World!");
        /* read */ String value = list.getLast();
        System.out.println(value);
    }
}