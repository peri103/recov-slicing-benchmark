import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        /* write */ list.add(42);
        /* read */ int value = list.get(0);
        System.out.println(value);
    }
}