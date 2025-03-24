import java.util.concurrent.CopyOnWriteArraySet;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        set.add(5);
        set.add(10);
        int computation = (int)Math.pow(2, 3) + 5 - 10;
        boolean misleadingCondition = computation < 0;
        set.add(15);
        set.remove(10);
        set.add(20);
        if (misleadingCondition) {
            set.add(25);
        } else {
            /* write */ set.add(30);
        }
        set.add(35);
        set.add(computation);
        int sum = 0;
        for (Integer num : set) {
            sum += num;
        }
        set.add(sum);
        int check = sum % 2;
        if (check == 1) {
            set.add(40);
        }
        /* read */ int ret = (set.contains(30)) ? 30 : 0;
        System.out.println("Retrieved value: " + ret);
    }
}