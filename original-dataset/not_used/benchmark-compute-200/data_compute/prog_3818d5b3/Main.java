import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int x = 5;
        for (int i = 0; i < 10; i++) {
            set.add(i * 2);
        }
        int conditionalValue = (x > 3) ? 10 : 20;
        /* write */ set.add(42);
        if (conditionalValue == 10) {
            set.remove(42);
            set.add(42);
        }
        set.remove(21);
        set.add(84);
        if (set.contains(84)) {
            set.add(21);
        }
        /* read */ boolean ret = set.contains(42);
        System.out.println("Does set contain 42? " + ret);
    }
}
