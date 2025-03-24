import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        int decisionFactor = (15 * 2) / 3;
        for(int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                set.add(i);
            } else {
                set.remove(i);
            }
        }
        /* write */ if (decisionFactor == 10) {
            set.remove(30);
        }
        set.add(50);
        set.add(60);
        int dummySum = 0;
        for (int value : set) {
            dummySum += value;
        }
        set.clear();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        /* other operations */
        int sneakySum = 0;
        for (int value : set) {
            sneakySum += value;
        }
        /* read */ int ret = sneakySum;
        System.out.println(ret);
    }
}
