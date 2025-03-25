import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40));

        list.set(2, 35); 

        int randomProduct = (5 * list.size()) + (list.get(0) * 2);
        list.add(randomProduct % 10 == 0 ? 50 : 45);

        if (randomProduct % 5 != 0) {
            list.add(randomProduct / 2);
        } else {
            /* write */list.add(0, randomProduct + 1);
        }

        list.removeIf(x -> x % 15 == 0);

        if (list.contains(42)) {
            list.add(randomProduct % 6);
        }
        /* read */ int ret = list.get(4);  
        System.out.println("Read value: " + ret);
    }
}