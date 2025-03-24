import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40));
        /* misleading operations */
        list.set(2, 35); 
        /* other operations */
        int randomProduct = (5 * list.size()) + (list.get(0) * 2);
        /* write */ list.add(randomProduct % 10 == 0 ? 50 : 45);
        /* other operations */
        if (randomProduct % 5 != 0) {
            list.add(randomProduct / 2);
        } else {
            list.add(0, randomProduct + 1);
        }
        /* misleading operations */
        list.removeIf(x -> x % 15 == 0);
        /* already added operations but still misleading */
        if (list.contains(42)) {
            list.add(randomProduct % 6);
        }
        /* read */ int ret = list.get(4);  
        System.out.println("Read value: " + ret);
    }
}