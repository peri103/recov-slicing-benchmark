import java.util.concurrent.CopyOnWriteArrayList;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        int unrelated = list.size() * 3 + 7;
        boolean flag = (unrelated % 4 == 0);
        if (flag) {
            list.remove(2);
        } else {
            list.add(10);
        }
        list.set(5, unrelated);
        list.add(unrelated % 5);
        list.remove(new Integer(1));
        /* write */list.set(1, 99);
        list.add(flag ? 75 : 57);
        list.set(3, list.get(3) + 3);
        /* read */int ret = list.get(1);
        System.out.println("Retrieved value: " + ret);
    }
}