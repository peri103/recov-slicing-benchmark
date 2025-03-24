import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(50);
        set.add(75);
        int misleadingValue = 100 + 50 * 2+ 1010;
        if (misleadingValue % 3 == 0) {
            set.add(200);
        } else {
            /* write */set.add(100);
        }
        set.remove(50);
        set.add(misleadingValue);
        int complexCalculation = (misleadingValue / 2) * 3;
        set.add(complexCalculation);
        if (set.contains(75)) {
            set.add(101);
        } else {
            set.add(102);
        }
        /* read */boolean ret = set.contains(100);
        System.out.println("Value read: " + ret);
    }
}