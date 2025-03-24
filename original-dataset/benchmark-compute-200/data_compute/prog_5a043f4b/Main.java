import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(0);
        list.add(10);
        Random random = new Random();
        int rand = random.nextInt(50) + 1;
        if (rand > 25) {
            list.add(rand);
        } else {
            list.remove((Integer) 10);
            list.add(25);
        }
        list.add(88);
        list.add(99);
        for (int i = 0; i < rand % 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("Element at index 0 before write: " + list.get(0));
        /* write */list.set(0, 42);
        for (int i = 0; i < rand % 5; i++) {
            list.add(7);
        }
        if (rand % 2 == 0) {
            list.add(100);
        } else {
            list.add(200);
        }
        System.out.println("Element at index 0 now: " + list.get(0));
        System.out.println("Element at index 1: " + list.get(1));
        /* read */int ret = list.get(0);
        System.out.println("Read value: " + ret);
    }
}
