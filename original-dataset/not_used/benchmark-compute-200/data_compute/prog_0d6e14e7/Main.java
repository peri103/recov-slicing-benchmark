import java.util.concurrent.CopyOnWriteArrayList;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(10);
        list.add(20);
        /* write */list.add(30);
        list.add(40);
        int unrelatedValue = list.size() * 5;
        int k = unrelatedValue % 7;
        if (k % 2 == 0) {
            list.add(25);
        } else {
            list.add(15);
        }
        list.add(50);
        list.remove(0);
        if (list.size() > 3 && list.contains(15)) {
            list.remove(Integer.valueOf(15));
        }
        list.add(60);
        list.add(70);
        /* read */ int ret = list.get(2);
        System.out.println("The retrieved value is: " + ret);
    }
}
