import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        /* write */ list.add(1);
        /* read */ int value = (Integer) list.get(0);
        System.out.println(value);
    }
}