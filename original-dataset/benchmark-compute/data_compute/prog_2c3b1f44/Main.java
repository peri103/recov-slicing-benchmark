import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 2);
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        if (sum % 10 > 5) {
            list.add(42);
        } else {
            /* write */list.add(24);
        }
        list.set(2, 100);
        list.add(200);
        System.out.println("Current state of list: " + list);
        /* read */int ret = list.get(5);
        System.out.println("Retrieved value: " + ret);
    }
}
